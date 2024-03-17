package pratica10.models;

public class Cliente {
   private String nome;
   private String cpf;
   
   
   public Cliente(String nome, String cpf) {
      this.nome = nome;
      this.cpf = cpf;
   }
   
   public String getNome() {
      return nome;
   }
   
   public String getCpf() {
      return cpf;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Cliente{");
      sb.append("nome='").append(nome);
      sb.append("cpf=").append(cpf);
      sb.append('}');
      return sb.toString();
   }
}
