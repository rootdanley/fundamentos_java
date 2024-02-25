package entities;

import java.util.Date;

public class HourContract {
   private Date date;
   private Double valuePerHour;
   private Integer hours;
   
   public HourContract() {
   }
   
   public HourContract(Date date, Double valuePerHour, Integer hours) {
      this.date = date;
      this.valuePerHour = valuePerHour;
      this.hours = hours;
   }
   
   public Date getDate() {
      return date;
   }
   
   public void setDate(Date date) {
      this.date = date;
   }
   
   public Double getValuePerHour() {
      return valuePerHour;
   }
   
   public void setValuePerHour(Double valuePerHour) {
      this.valuePerHour = valuePerHour;
   }
   
   public Integer getHours() {
      return hours;
   }
   
   public void setHours(Integer hours) {
      this.hours = hours;
   }
   
   public double totalValue(){
      return valuePerHour * hours;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("HourContract{");
      sb.append("date=").append(date);
      sb.append(", valuePerHour=").append(valuePerHour);
      sb.append(", hours=").append(hours);
      sb.append('}');
      return sb.toString();
   }
}
