package pratica03.model;

import pratica03.enums.GeneroLiterario;

public class Livro {
   private String titulo;
   private String autor;
   
   private  Integer anoPublicacao;
   
   private GeneroLiterario genero;
   
   public Livro(String titulo, String autor, Integer anoPublicacao, GeneroLiterario genero) {
      this.titulo = titulo;
      this.autor = autor;
      this.anoPublicacao = anoPublicacao;
      this.genero = genero;
   }
   
   public String getTitulo() {
      return titulo;
   }
   
   public String getAutor() {
      return autor;
   }
   
   public Integer getAnoPublicacao() {
      return anoPublicacao;
   }
   
   public GeneroLiterario getGenero() {
      return genero;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Livro{");
      sb.append("titulo='").append(titulo).append('\'');
      sb.append(", autor='").append(autor).append('\'');
      sb.append(", anoPublicacao=").append(anoPublicacao);
      sb.append(", genero=").append(genero);
      sb.append('}');
      return sb.toString();
   }
}
