package Vetores;

import java.util.Scanner;

public class vet06 {
  public static void main(String[] args) {
    // Faça um programa que leia N números reais e armazene-os em um vetor. Em
    // seguida, mostrar na tela
    // o maior número do vetor (supor não haver empates). Mostrar também a posição
    // do maior elemento,
    // considerando a primeira posição como 0 (zero).

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o num:");
    int vetNum[] = new int[sc.nextInt()];

    for (int i = 0; i < vetNum.length; i++) {
      System.out.print("Digite o numero " + (i + 1) + ":");
      vetNum[i] = sc.nextInt();
    }

    int maior = vetNum[0];
    int posicao = 0;

    for (int i = 0; i < vetNum.length; i++) {
      if (vetNum[i] > maior) {
        maior = vetNum[i];
        posicao = i + 1;
      }
    }

    System.out.println("Maior numero: " + maior);
    System.out.println("Posicao: " + posicao);
    sc.close();

  }
}
