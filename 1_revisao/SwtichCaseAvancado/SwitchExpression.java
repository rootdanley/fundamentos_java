package Revisao.SwtichCaseAvancado;

import java.util.Scanner;

public class SwitchExpression {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num = sc.nextInt();

    // nova funcionalidade introduzida no Java 12, conhecida como "Switch
    // Expression" (Expressão Switch). Essa é uma versão avançada do tradicional
    // bloco switch-case
    switch (num) {
      case 1 -> System.out.println("Vai no caso 1");
      case 2 -> System.out.println("Vai no caso 2");
    }

    // exemplo 2
    final String ONE = "one", TWO = "two", THREE = "three",
        FOUR = "four", FIVE = "five";

    System.out.println("String numero: ");
    sc.nextLine();
    String str = sc.nextLine();

    switch (str) {
      case ONE, TWO -> System.out.println("1");
      case THREE, FOUR -> System.out.println("2");
      case FIVE -> System.out.println("3");
      default -> System.out.println("Error: Unknown string");

    }
  }
}
