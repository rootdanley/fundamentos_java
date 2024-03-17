package pratica12.models;

public class OutsourcedEmployee extends Employee{
   
   private Double additionalCharge;
   
   public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
      super(name, hours, valuePerHour);
      this.additionalCharge = additionalCharge;
   }
   
   public Double getAdditionalCharge() {
      return additionalCharge;
   }
   
   public void setAdditionalCharge(Double additionalCharge) {
      this.additionalCharge = additionalCharge;
   }
   
   
//   polimorfismo, o metodo payment é chamado de acordo com o objeto
   @Override
   public Double payment() {
      return super.payment() + this.additionalCharge * 1.1;
   }
}
