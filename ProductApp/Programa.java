package ProductApp;

import java.util.Scanner;

import ProductApp.entities.Product;

public class Programa {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Product product = new Product(); // instanciado o objeto

    System.out.println("Enter product data:");
    System.out.print("Name:");
    product.name = sc.nextLine();
    System.out.print("Price:");
    product.price = sc.nextDouble();
    System.out.print("Quantity in stock:");
    product.quantity = sc.nextInt();

    System.out.println("Product data:" + product);
    System.out.println();

    System.out.print("Enter the number of products to be added in stock:");
    int quantity = sc.nextInt();
    product.addProducts(quantity);

    System.out.println("Update data:" + product);

    System.out.println();
    System.out.print("Enter the number of products to be removed in stock:");
    quantity = sc.nextInt();
    product.removeProducts(quantity);

    System.out.println("Update data:" + product);
    sc.close();
  }
}
