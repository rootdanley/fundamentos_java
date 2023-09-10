package TrabalhoApp.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import TrabalhoApp.entities.enumerado.WorkerLevel;

public class Trabalhador {
  private String name;
  private WorkerLevel level;
  private Double baseSalary;

  private Departamento departamento;
  private List<HorasContrato> contratos = new ArrayList<HorasContrato>();

  public Trabalhador() {
  }

  public Trabalhador(String name, WorkerLevel level, Double baseSalary, Departamento departamento) {
    this.name = name;
    this.level = level;
    this.baseSalary = baseSalary;
    this.departamento = departamento;
  }

  public String getName() {
    return name;
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

  public Departamento getDepartamento() {
    return departamento;
  }

  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }

  public List<HorasContrato> getContratos() {
    return contratos;
  }

  // METODOS
  public void addContrato(HorasContrato contrato) {
    this.contratos.add(contrato);
  }

  public void removeContrato(HorasContrato contrato) {
    this.contratos.remove(contrato);
  }

  public double income(int year, int month) {
    double sum = baseSalary;
    Calendar cal = Calendar.getInstance();
    for (HorasContrato contrato : contratos) {
      cal.setTime(contrato.getDate());
      int contrato_year = cal.get(Calendar.YEAR);
      int contrato_month = cal.get(Calendar.MONTH);
      if (contrato_year == year && contrato_month == month) {
        sum += contrato.totalValue();
      }
    }

    return sum;
  }

}
