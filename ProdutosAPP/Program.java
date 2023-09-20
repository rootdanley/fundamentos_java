package ProdutosAPP;

import java.util.Scanner;

import ProdutosAPP.entities.Produtos;

public class Program {
  
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);

  Produtos[] prods = new Produtos[3];
  double sum = 0.0;

  for(int i = 0; i < prods.length; i++){
    System.out.println("Nome produto: ");
    String nome = sc.nextLine();
    sc.nextLine();
    System.out.println("Preco produto: ");
    double preco = sc.nextDouble();

    prods[i] = new Produtos(nome, preco);

    
    sum += preco;
    
  }

  
  System.out.printf("AVERAGE PRICE = %.2f%n", (sum / prods.length));

  }
  
}
