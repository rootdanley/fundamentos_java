package Revisao.Vetores;

import java.util.Scanner;

public class vetor01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o tamanho do vetor:");
    int n = sc.nextInt();

    // DECLARAÇÃO DE VETOR
    double[] vector = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Num " + i + ":");
      vector[i] = sc.nextDouble();
    }

    // Usando um loop for-each para percorrer o vetor
    for (double valor : vector) {
      System.out.println("Valor: " + valor);
    }
  }
}
