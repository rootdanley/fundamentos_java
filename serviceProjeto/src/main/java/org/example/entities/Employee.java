package org.example.entities;

public class Employee {
  private String nome;
  private Double grossSalary;

  public Employee(){}

  public Employee(String nome, Double grossSalary) {
    this.nome = nome;
    this.grossSalary = grossSalary;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getGrossSalary() {
    return grossSalary;
  }

  public void setGrossSalary(Double grossSalary) {
    this.grossSalary = grossSalary;
  }



}
