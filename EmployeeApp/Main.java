package EmployeeApp;

import java.util.Scanner;

import EmployeeApp.entities.Employee;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Employee emplo = new Employee();
    System.out.print("Name: ");
    emplo.name = sc.nextLine();

    System.out.print("Gross salary: ");
    emplo.grossSalary = sc.nextDouble();

    System.out.print("Tax:");
    emplo.tax = sc.nextInt();

    System.out.printf("Employee: %s", emplo);

    System.out.print("\nWhich percentage to increase salary?:");
    int percentage = sc.nextInt();
    emplo.increaseSalary(percentage);

    System.out.printf("Updated data: %s", emplo);

  }
}
