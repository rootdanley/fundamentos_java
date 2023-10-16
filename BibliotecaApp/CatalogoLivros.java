package BibliotecaApp;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  List<Livro> livros;

  public CatalogoLivros() {
    this.livros = new ArrayList<Livro>();
  }


  public void adicionarLivro(String titulo, String autor, Integer ano){
    livros.add(new Livro(titulo, autor, ano));
  }
   
  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> resultadoPorAutor = new ArrayList<Livro>();
    if(!livros.isEmpty()) {
      for(Livro l : livros) {
        if(l.getAutor().equalsIgnoreCase(autor)){
          resultadoPorAutor.add(l);
        }
      }
    }
    return resultadoPorAutor;
  }


  public List<Livro> pesquisarPorAno(Integer anoInicial, Integer anoFinal) {
    List<Livro> resultadoPorAno = new ArrayList<>();
    if(!livros.isEmpty()) {
      for(Livro l : livros) {
        if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
          resultadoPorAno.add(l);
        }
      }

      
    }
    return resultadoPorAno;
  }

  public List<Livro> pesquisarPorTitulo(String titulo) {
    List<Livro> resultadoPorTitulo = new ArrayList<Livro>();
    if(!livros.isEmpty()) {
      for(Livro l : livros) {
        if(l.getTitulo().equalsIgnoreCase(titulo)){
          resultadoPorTitulo.add(l);
        }
      }
    }
    return resultadoPorTitulo;
  }
}
