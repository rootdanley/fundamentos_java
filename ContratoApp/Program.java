package ContratoApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ContratoApp.entities.Department;
import ContratoApp.entities.HourContract;
import ContratoApp.entities.Worker;
import ContratoApp.entities.enumContrato.WorkerLevel;


public class Program {
  public static void main(String[] args) throws ParseException{
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter department name: ");
    String deptName = sc.nextLine();

    System.out.print("Enter worker data: ");
    System.out.println("Name: ");
    String workerName = sc.nextLine();

    System.out.print("Level: ");
    String workerLevel = sc.nextLine();

    System.out.print("Base Salary: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(deptName));



    System.out.print("How many contracts: ");
    int numContracts = sc.nextInt();

    for (int i = 0; i < numContracts; i++) {
      System.out.printf("Enter contract #%d data: ", i);
      System.out.print("Date (DD/MM/YYYY): ");
      Date contractDate = sdf.parse(sc.next());
      System.out.print("Value per Hour: ");
      double valuePerHour = sc.nextDouble();

      System.out.print("Duration: ");
      int hours = sc.nextInt();
      HourContract contract = new HourContract(contractDate, valuePerHour, hours);

      worker.addContract(contract);
    }

    System.out.println();

    System.out.print("Enter month and year: ");
    String monthAndYear = sc.next();

    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));


    System.out.println("Name:" + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.printf("Income for %s : %.2f", monthAndYear, worker.income(year, month));

    sc.close();
  }
}
