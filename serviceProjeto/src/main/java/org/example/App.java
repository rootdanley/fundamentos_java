package org.example;

import org.example.entities.Employee;
import org.example.services.PensionService;
import org.example.services.SalaryService;
import org.example.services.SuperImpostoService;
import org.example.services.TaxService;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Salario: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(nome, grossSalary);

        TaxService taxService = new SuperImpostoService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);
        System.out.printf("salario liquido = %.2f%n", netSalary);


    }
}
