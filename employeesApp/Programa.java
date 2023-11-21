package employeesApp;

import employeesApp.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();


        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for(int i = 0; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsorced (y/n)? ");
            char ch = sc.next().charAt(0);

            System.out.print("name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(ch == 'y'){
                System.out.print("additional charge: ");
                double additionalCharge = sc.nextDouble();
            }
        }


        sc.close();


    }
}