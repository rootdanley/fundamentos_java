package CurrencyConveterApp;

import java.util.Scanner;

import CurrencyConveterApp.util.CurrencyConverter;


public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    CurrencyConverter cc = new CurrencyConverter();

    System.out.print("What is the dollar price:");
    cc.setDollar(sc.nextDouble());

    System.out.println("How many dollars will be bought?");
    Double price = sc.nextDouble();

    System.out.printf("Amount to be paid in reais %.2f", cc.convert(price));

  }

}
