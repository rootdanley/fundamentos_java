package pratica08.models;

public class Curso {
   private String nome;
   
   public Curso(String nome) {
      this.nome = nome;
   }
   
   public String getNome() {
      return nome;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Curso{");
      sb.append("nome='").append(nome).append('\'');
      sb.append('}');
      return sb.toString();
   }
}
