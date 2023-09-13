package Examples.lacoFor;

import java.util.Scanner;

public class Erros {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] array = new int[2];

    try {
      array[2] = 10;
    } catch (Exception e) {
      System.err.println("Mensagem de erro: " + e.getMessage());
      e.printStackTrace(); // mostra a linha do erro
    }

    sc.close();

  }
}
