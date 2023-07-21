import entities.Product;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); // instanciado o objeto
		
		System.out.println("Enter product data:");
		System.out.print("Name:");
		product.name = sc.nextLine();
		System.out.print("Price:");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock:");
		product.quantity = sc.nextInt();
		
		System.out.print(product.getClass());
		
		sc.close();
	}
}
