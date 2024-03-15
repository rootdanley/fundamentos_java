package pratica03;

import pratica03.enums.GeneroLiterario;
import pratica03.model.Biblioteca;
import pratica03.model.Livro;

public class TesteDeBiblioteca {
   public static void main(String[] args) {
      Biblioteca biblioteca = new Biblioteca();
      
      biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 1949, GeneroLiterario.FICCAO));
      biblioteca.adicionarLivro(new Livro("Uma Breve História do Tempo", "Stephen Hawking", 1988, GeneroLiterario.EDUCATIVO));
      biblioteca.adicionarLivro(new Livro("O Código Da Vinci", "Dan Brown", 2003, GeneroLiterario.MISTERIO));
      
      System.out.println("Todos os livros:");
      biblioteca.listarTodos().forEach(System.out::println);
      
      System.out.println("\nLivros de Ficção:");
      biblioteca.filtrarPorGenero(GeneroLiterario.FICCAO).forEach(System.out::println);
   }
}
