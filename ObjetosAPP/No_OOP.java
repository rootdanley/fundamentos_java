package ObjetosAPP;

import java.util.Scanner;

/*
resolvendo um problema sem orientacao a objetos
 */
public class No_OOP {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double xA, xB, xC, yA, yB, yC;

    // triangulo X
    System.out.println("Enter the measures of triangle X:");
    xA = sc.nextDouble();
    xB = sc.nextDouble();
    xC = sc.nextDouble();

    // triangulo Y

    System.out.println("Enter the measures of tringle Y:");
    yA = sc.nextDouble();
    yB = sc.nextDouble();
    yC = sc.nextDouble();

    double p = (xA + xB + xC) / 2.0;
    double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

    p = (yA + yB + yC) / 2.0;
    double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

    System.out.printf("Triangle X area: %.4f%n", areaX);
    System.out.printf("Triangle X area: %.4f%n", areaY);

    if (areaX > areaY) {
      System.out.println("Larger area: X");
    } else {
      System.out.println("Larger area: Y");

    }

    sc.close();
  }
}
