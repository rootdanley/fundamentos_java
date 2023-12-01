package com.servicesdanley.services;

import EmployeeApp.entities.Employee;

public class SalaryService {

  private TaxService taxService;
  private PensionService pensionService;

  public SalaryService(TaxService taxService, PensionService pensionService) {
    this.taxService = taxService;
    this.pensionService = pensionService;
  }

  public double netSalary(Employee employee){
    return 23;
  }


}
