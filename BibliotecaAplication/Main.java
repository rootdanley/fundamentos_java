package BibliotecaAplication;

import BibliotecaAplication.entities.ListaLivro;

public class Main {
  public static void main(String[] args) {
    ListaLivro livros = new ListaLivro();

    livros.adicionarLivro("java","danley",2020,2);
    livros.adicionarLivro("javascript","danley",2020,1);


    System.out.println(livros);
    // livros.emprestarLivro("java");
    System.out.println(livros);
    livros.devolverLivro("java");
  }
}
