package pratica09.models;

public class ItemEstoque {
   private Produto produto;
   private Integer quantidade;
   
   
   public ItemEstoque(Produto produto, Integer quantidade) {
      this.produto = produto;
      this.quantidade = quantidade;
   }
   
   public Produto getProduto() {
      return produto;
   }
   
   public Integer getQuantidade() {
      return quantidade;
   }
   
   public void setQuantidade(Integer quantidade) {
      this.quantidade = quantidade;
   }
   
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("ItemEstoque{");
      sb.append("produto=").append(produto);
      sb.append(", quantidade=").append(quantidade);
      sb.append('}');
      return sb.toString();
   }
}
