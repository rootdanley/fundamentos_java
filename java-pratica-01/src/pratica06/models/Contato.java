package pratica06.models;

public class Contato {
   private String nome;
   private String email;
   private String telefone;
   
   public Contato(String nome, String email, String telefone) {
      this.nome = nome;
      this.email = email;
      this.telefone = telefone;
   }
   
   public String getNome() {
      return nome;
   }
   
   public String getEmail() {
      return email;
   }
   
   public String getTelefone() {
      return telefone;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Contato{");
      sb.append("nome='").append(nome).append('\'');
      sb.append(", email='").append(email).append('\'');
      sb.append(", telefone='").append(telefone).append('\'');
      sb.append('}');
      return sb.toString();
   }
}
