import java.util.Scanner;

public class vet05 {
  public static void main(String[] args) {
//     Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
// tela todos os números pares, e também a quantidade de números pares.

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o num:");
    int[] vetor = new int[sc.nextInt()];



    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Digite o num:");
      vetor[i] = sc.nextInt();
    }


    int qtdPares = 0;

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] % 2 == 0) {
        
        System.out.println(vetor[i]);
        qtdPares++;
      }
    }

    System.out.println("qtd de pares" + qtdPares);
    sc.close();



  }
}
