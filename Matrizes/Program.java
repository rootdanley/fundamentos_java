package Matrizes;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    // matriz é declarada quando abre dois colchetes
    int[][] matriz = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matriz[i][j] = sc.nextInt();
      }
    }

    sc.close();
  }
}
