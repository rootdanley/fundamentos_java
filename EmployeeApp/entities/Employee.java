package EmployeeApp.entities;

public class Employee {
  // attributes
  public String name;
  public double grossSalary;
  public double tax;

  // methods
  public double netSalary() {
    return grossSalary - tax;
  }

  public void increaseSalary(double percentage) {
    grossSalary += grossSalary * (percentage / 100);
  }

  // metodo para exibir os dados
  public String toString() {
    return name +
        String.format(", R$%.2f", netSalary());
  }
}
