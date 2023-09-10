package Vetores;

import java.util.Scanner;

public class vt01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Number of persons: ");
    int n = sc.nextInt();

    // declarando vetor
    double[] vect = new double[n];

    double sum = 0.0;
    for (int i = 0; i < n; i++) {
      System.out.println("Enter height: ");
      vect[i] = sc.nextDouble();
      sum += vect[i];
    }

    System.out.println("Average: " + sum / n);

    for (int i = 0; i < n; i++) {
      System.out.println("Height: " + vect[i]);
    }

    sc.close();
  }
}
