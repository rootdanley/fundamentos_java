package pratica13.models;

import java.time.LocalDate;
import java.util.Date;

public class UsedProduct extends Product{
   
   private LocalDate manufactureDate;
   
   public UsedProduct(String name, Double price, LocalDate manufactureDate) {
      super(name, price);
      this.manufactureDate = manufactureDate;
   }
   
   public LocalDate getManufactureDate() {
      return manufactureDate;
   }
   
   @Override
   public String priceTag() {
      return getName() + " (used) R$" + getPrice() + "(Manufacture date: " + getManufactureDate() + ")";
   }
}
