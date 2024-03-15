package pratica03.model;

import pratica03.enums.GeneroLiterario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {

   private List<Livro> livros;
   
   public Biblioteca() {
      this.livros = new ArrayList<>();
   }
   
   public void adicionarLivro(Livro livro) {
      livros.add(livro);
   }
   
   public List<Livro> listarTodos() {
      return new ArrayList<>(livros);
   }
   
   public List<Livro> filtrarPorGenero(GeneroLiterario genero) {
      return livros.stream()
          .filter(livro -> livro.getGenero() == genero)
          .collect(Collectors.toList());
   }
}
