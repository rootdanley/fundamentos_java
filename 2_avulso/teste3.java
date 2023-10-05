package baguncinha;
import java.util.Scanner;

public class teste3 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("num de produtos: ");
    int numero = sc.nextInt();

    Produto[] produtos = new Produto[numero];
    double soma = 0.0;


    for(int i = 0; i < produtos.length; i++){
      System.out.println("Digite o nome do produto " + (i + 1) + ":");
      String nome = sc.next();

      System.out.println("Digite o preço do produto " + (i + 1) + ":");
      double preco = sc.nextDouble();

      produtos[i] = new Produto(nome, preco);
      soma += produtos[i].getPreco();
    }

    System.out.printf("AVG: %.2f",(soma/produtos.length));
    for(Produto p : produtos){
      System.out.println(p);
    }

  }
}
