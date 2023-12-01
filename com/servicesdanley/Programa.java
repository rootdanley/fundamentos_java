package com.servicesdanley;

import com.servicesdanley.entities.Employee;
import com.servicesdanley.services.PensionService;
import com.servicesdanley.services.SalaryService;
import com.servicesdanley.services.TaxService;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("nome: ");
    String nome = sc.nextLine();
    System.out.println("salario bruto: ");
    double grossSalary = sc.nextDouble();

    Employee employee = new Employee(nome, grossSalary);

    TaxService taxService = new TaxService();
    PensionService pensionService = new PensionService();

    SalaryService salaryService = new SalaryService(taxService, pensionService);

    double netSalary = salaryService.netSalary(employee);



    sc.close();

  }
}
