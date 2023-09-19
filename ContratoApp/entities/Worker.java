package ContratoApp.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ContratoApp.entities.enumContrato.WorkerLevel;

public class Worker {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;

  private Department department;
  private List<HourContract> contracts = new ArrayList<HourContract>();

  // public Worker() {
  // }


  public Worker(String name, WorkerLevel level, Double base, Department department){
    this.name = name;
    this.level = level;
    this.baseSalary = base;
    this.department = department;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public WorkerLevel getLevel() {
    return level;
  }
  public void setLevel(WorkerLevel level) {
    this.level = level;
  }
  public Double getBaseSalary() {
    return baseSalary;
  }
  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }
  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

  public void addContract(HourContract contract) {
    this.contracts.add(contract);
  }

  public void removeContract(HourContract contract){
    this.contracts.remove(contract);
  }

  public double income(int year, int month){
    double sum = baseSalary;
    Calendar cal = Calendar.getInstance();
    for(HourContract c : contracts) {
      cal.setTime(c.getDate());
      int c_year = cal.get(Calendar.YEAR);
      int c_month = cal.get(Calendar.MONTH);
      if(year == c_year && month == c_month){
        sum += c.totalValue();
      }
    }

    return sum;
  }
}
