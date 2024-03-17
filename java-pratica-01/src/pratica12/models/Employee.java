package pratica12.models;

public class Employee {
   private String name;
   private Integer  hours;
   private Double valuePerHour;
   
   public Employee(String name, Integer hours, Double valuePerHour) {
      this.name = name;
      this.hours = hours;
      this.valuePerHour = valuePerHour;
   }
   
   
   public String getName() {
      return name;
   }
   
   public Integer getHours() {
      return hours;
   }
   
   public Double getValuePerHour() {
      return valuePerHour;
   }
   
   public Double payment() {
      return valuePerHour * hours;
   }
}
