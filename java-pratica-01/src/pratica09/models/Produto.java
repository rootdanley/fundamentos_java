package pratica09.models;

public class Produto {
   private String nome;
   private Double preco;
   
   
   public Produto(String nome, Double preco) {
      this.nome = nome;
      this.preco = preco;
   }
   
   public String getNome() {
      return nome;
   }
   
   public Double getPreco() {
      return preco;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Produto{");
      sb.append("nome='").append(nome).append('\'');
      sb.append(", preco=").append(preco);
      sb.append('}');
      return sb.toString();
   }
}
