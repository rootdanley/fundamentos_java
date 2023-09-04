import java.util.Scanner;

import entities.Produtos;

// VETOR COM TIPO REFERENCIA
public class vt02 {
  public static void main(String[] args){
    // fazer um programa para ler um numero inteiro 'n' e os dados (nome e preço)
    // de 'n' produtos. Armazene os 'n' produtos em um vetor. Em seguida, mostrar o preço médio dos produtos

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o numero de produtos: ");
    int n = sc.nextInt();

    Produtos[] vect = new Produtos[n]; // declaracao de vetor de 'N' Produtos

    for(int i = 0; i < vect.length; i++){
      sc.nextLine();
      System.out.println("Digite o nome do produto: ");
      String nome = sc.nextLine();

      System.out.println("Digite o preço do produto: ");
      double preco = sc.nextDouble();

      Produtos p = new Produtos(nome, preco);
      vect[i] = p;
    }


    double sum = 0.0;

    for(int i = 0; i < vect.length; i++){
      sum += vect[i].getPrice();
    }

    
    double media = sum / vect.length;
    System.out.println("average price: " + media);


    sc.close();
  }
}
