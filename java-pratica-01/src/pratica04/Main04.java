package pratica04;

import pratica04.models.BancoDeDados;
import pratica04.models.ItemPedido;
import pratica04.models.Pedido;
import pratica04.models.Produto;

import java.util.Map;
import java.util.Scanner;

public class Main04 {
   public static void main(String[] args) {
      // Criação de produtos
//      Produto p1 = new Produto("Livro Java Efetivo", 45.00);
//      Produto p2 = new Produto("Notebook Gamer", 1200.00);
//      Produto p3 = new Produto("Cafeteira Elétrica", 95.50);
//
//      // Criação do pedido
//      Pedido pedido = new Pedido();
//
//      // Adicionando itens ao pedido
//      pedido.adicionarItem(new ItemPedido(p1, 2)); // 2 unidades de Livro Java Efetivo
//      pedido.adicionarItem(new ItemPedido(p2, 1)); // 1 unidade de Notebook Gamer
//      pedido.adicionarItem(new ItemPedido(p3, 1)); // 1 unidade de Cafeteira Elétrica
//
//      // Imprimindo detalhes do pedido
//      pedido.imprimirPedido();
      
      Map<Integer, Produto> produtos = BancoDeDados.getProdutosDisponiveis();
      Pedido pedido = new Pedido();
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Produtos Disponíveis:");
      for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue().getNome() + " - Preço: " + entry.getValue().getPreco());
      }
      
      while (true) {
         System.out.println("\nDigite o número do produto para adicionar ao pedido (0 para finalizar):");
         int escolha = scanner.nextInt();
         if (escolha == 0) {
            break;
         }
         
         Produto produtoEscolhido = produtos.get(escolha);
         if (produtoEscolhido == null) {
            System.out.println("Produto inválido. Tente novamente.");
            continue;
         }
         
         System.out.println("Quantidade:");
         int quantidade = scanner.nextInt();
         
         ItemPedido item = new ItemPedido(produtoEscolhido, quantidade);
         pedido.adicionarItem(item);
         System.out.println("Item adicionado ao pedido: " + produtoEscolhido.getNome() + " - Quantidade: " + quantidade);
      }
      
      System.out.println("\nResumo do Pedido:");
      pedido.imprimirPedido();
   }
   
}
