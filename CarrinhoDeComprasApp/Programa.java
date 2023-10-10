package CarrinhoDeComprasApp;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);

    ListaDeCompra listaCompras = new ListaDeCompra();


    for(int i = 0; i < 3; i++) {
      System.out.println("Nome item: ");
      String nome = sc.nextLine();
      System.out.println("Preço: ");
      Double preco = sc.nextDouble();
      System.out.println("Quantidade: ");
      Integer quantidade = sc.nextInt();

      sc.nextLine();
      listaCompras.adicionarItem(nome, preco, quantidade);
    }

    listaCompras.exibirCarrinho();


    listaCompras.removerItem("mouse");
    listaCompras.exibirCarrinho();
    System.out.println("Valor total: " + listaCompras.CalcularValorTotal());

  }
}
