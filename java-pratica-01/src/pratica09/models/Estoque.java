package pratica09.models;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
   private List<ItemEstoque> itemEstoqueList;
   
   public Estoque() {
      this.itemEstoqueList = new ArrayList<>();
   }
   
   public List<ItemEstoque> getItemEstoqueList() {
      return itemEstoqueList;
   }
   
   public void addItem(ItemEstoque itemEstoque) {
      itemEstoqueList.add(itemEstoque);
   }
   
   public void updateItemEstoque(String nome, int quantidade) {
      for(ItemEstoque item : itemEstoqueList) {
         if(item.getProduto().getNome().equalsIgnoreCase(nome)) {
            item.setQuantidade(quantidade);
         } else {
            System.out.println("Produto nao existe");
         }
      }
   }
   
   public void listarItensEstoque() {
      System.out.println("ITENS EM ESTOQUE:");
      for(ItemEstoque itens : itemEstoqueList) {
         System.out.println("Nome: " + itens.getProduto().getNome() + " - Quantidade: " + itens.getQuantidade());
      }
   }
}
