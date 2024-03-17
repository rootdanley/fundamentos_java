package pratica07;

import pratica07.enums.StatusPedido;

public class Main07 {
   public static void main(String[] args) {
      // Exemplo de alteração do status do pedido
      StatusPedido statusAtual = StatusPedido.NOVO;
      
      System.out.println("Status atual: " + statusAtual);
      System.out.println("Descrição: " + statusAtual.getDescricao());
      
      // Simulando mudança de status
      statusAtual = StatusPedido.ENTREGUE;
      
      System.out.println("\nStatus atual: " + statusAtual);
      System.out.println("Descrição: " + statusAtual.getDescricao());
   }
}
