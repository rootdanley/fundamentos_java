package pratica13.models;

public class ImportedProduct extends Product{
   private Double customsFee;
   
   public ImportedProduct(String name, Double price, Double customsFee) {
      super(name, price);
      this.customsFee = customsFee;
   }
   
   public Double getCustomsFee() {
      return customsFee;
   }
   
   @Override
   public String priceTag() {
      return getName() + " R$ " + (getPrice() + getCustomsFee()) + "(Custmos fee: R$" + getCustomsFee() + ")";
   }
   
   public Double totalPrice() {
      return 0.0;
   }
}
