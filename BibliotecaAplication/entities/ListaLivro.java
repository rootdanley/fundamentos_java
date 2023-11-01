package BibliotecaAplication.entities;

import java.util.ArrayList;
import java.util.List;

public class ListaLivro {
  List<Livro> livros;

  public ListaLivro(){
    this.livros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, Integer anoPublicacao, Integer numCopiasDisponiveis) {
    livros.add(new Livro(titulo, autor, anoPublicacao, numCopiasDisponiveis));
  }

  public void emprestarLivro(String titulo){
    for (Livro l : livros) {
      if(titulo.equalsIgnoreCase(l.getTitulo())){
        l.setNumCopiasDisponiveis(l.getNumCopiasDisponiveis()-1);
      }
    }
  }

  public void devolverLivro(String titulo) {
    for (Livro l : livros){
      if(titulo.equalsIgnoreCase(l.getTitulo())){
        l.setNumCopiasDisponiveis(l.getNumCopiasDisponiveis()+1);
      }
    }
  }

  @Override
  public String toString() {
    return "{" +
        "livros=" + livros +
        '}' + "/n";
  }
}
