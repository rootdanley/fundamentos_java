package pratica09;

import pratica09.models.Estoque;
import pratica09.models.ItemEstoque;
import pratica09.models.Produto;

public class Main90 {
   public static void main(String[] args) {
      
      Estoque estoque = new Estoque();

      ItemEstoque itemEstoque = new ItemEstoque(new Produto("Mouse", 103.00), 4);
      ItemEstoque itemEstoque2 = new ItemEstoque(new Produto("Gabinete", 160.00), 4);
      
      estoque.addItem(itemEstoque);
      estoque.addItem(itemEstoque2);
      
      
      estoque.listarItensEstoque();
   }
}
