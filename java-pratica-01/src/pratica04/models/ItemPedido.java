package pratica04.models;

public class ItemPedido {
   
   private Produto produto;
   private Integer quantidade;
   
   public ItemPedido(Produto produto, Integer quantidade) {
      this.produto = produto;
      this.quantidade = quantidade;
   }
   
   public Produto getProduto() {
      return produto;
   }
   
   public Integer getQuantidade() {
      return quantidade;
   }
   
   public double calcularSubtotal() {
      return produto.getPreco() * quantidade;
   }
}
