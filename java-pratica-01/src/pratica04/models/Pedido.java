package pratica04.models;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
   private List<ItemPedido> itens;
   
   public Pedido() {
      this.itens = new ArrayList<>();
   }
   
   public void adicionarItem(ItemPedido item) {
      itens.add(item);
   }
   
   
   // Calcula o valor total do pedido somando o subtotal de cada item
   public double calcularTotal() {
      double total = 0;
      for (ItemPedido item : itens) {
         total += item.calcularSubtotal();
      }
      return total;
   }
   
   public void imprimirPedido() {
      System.out.println("Detalhes do Pedido:");
      for (ItemPedido item : itens) {
         System.out.println(item.getProduto().getNome() + " - Categoria: " + item.getProduto().getCategoria() +  " - Quantidade: " + item.getQuantidade() + " - Subtotal: " + item.calcularSubtotal());
      }
      System.out.println("Total do Pedido: " + calcularTotal());
   }
}
