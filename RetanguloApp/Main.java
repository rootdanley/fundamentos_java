package RetanguloApp;

import java.util.Scanner;

import RetanguloApp.entities.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Rectangle rect = new Rectangle();

    System.out.println("enter rectangle width and height:");
    rect.width = sc.nextDouble();
    rect.height = sc.nextDouble();

    System.out.println("AREA = " + rect.area());
    System.out.println("PERIMETER = " + rect.perimeter());
    System.out.println("DIAGONAL = " + rect.diagonal());

    sc.close();
  }
}