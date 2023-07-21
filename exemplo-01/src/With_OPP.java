import entities.Triangle;

import java.util.Scanner;

public class With_OPP {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of tringle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.b = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle X area: %.4f%n", areaY);
		
		if(areaX > areaY){
			System.out.println("Larger area: X");
		}
		else{
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}
