package pratica05.models;

import pratica05.enums.WorkerLevel;

import java.util.List;

public class Worker {
   private String name;
   private WorkerLevel level;
   private Double baseSalary;
   
   private Department department; // COMPOSICAO DE OBJETO
   
   private List<HourContract> contracts; // COMPOSICAO DE OBJETO
}
