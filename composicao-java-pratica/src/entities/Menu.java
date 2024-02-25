package entities;

import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
   Scanner sc;
   SimpleDateFormat sdf;
   Worker worker;
   HourContract contract;
   
   public Menu() {
      sc = new Scanner(System.in);
      sdf = new SimpleDateFormat("dd/MM/yyyy");
   }
   
   public void exibirMenu() throws ParseException {
      workerData();
//      workerContract();
//      viewWorkerIncome();
      
      sc.close();
   }
   
   private void workerData() throws ParseException {
      System.out.println("Enter department's name: ");
      String departmentName = sc.nextLine();
      
      System.out.println("Enter Worker data: ");
      
      
      System.out.println("Name: ");
      String workerName = sc.nextLine();
      
      System.out.println("Level: ");
      String workerLevel = sc.nextLine();
      
      System.out.println("Base Salary: ");
      double baseSalary = Double.parseDouble(sc.nextLine());
      
      Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));
      workerContract(worker);
      viewWorkerIncome(worker);
   }
   
   private void workerContract(Worker worker) throws ParseException {
      System.out.println("How many contracts to this worker? ");
      int n = Integer.parseInt(sc.nextLine());
      
      for (int i = 1; i <= n; i++) {
         System.out.println("Enter contract #" + i + " data:");
         System.out.println("Date (DD/MM/YYYY): ");
         Date contractDate = sdf.parse(sc.nextLine());
         System.out.println("Value per hour: ");
         double valuePerHour = Double.parseDouble(sc.nextLine());
         System.out.println("Duration (hours): ");
         int hours = Integer.parseInt(sc.nextLine());
         contract = new HourContract(contractDate, valuePerHour, hours);
         worker.addContract(contract);
      }
   }
   
   private void viewWorkerIncome(Worker worker) {
      System.out.println("Enter month and year to calculate income (MM/YYYY): ");
      String monthAndYear = sc.next();
      
      int month = Integer.parseInt(monthAndYear.substring(0,2));
      int year = Integer.parseInt(monthAndYear.substring(3));
      
      System.out.println("Name:" + worker.getName());
      System.out.println("Department:" + worker.getDepartment().getName());
      System.out.println("Income for " + monthAndYear + " : " + worker.income(year,month));
   }
}
