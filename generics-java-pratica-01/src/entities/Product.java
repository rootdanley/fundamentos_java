package entities;

public class Product implements Comparable<Product>{
   private String name;
   private Double price;
   
   public Product(String name, Double price) {
      this.name = name;
      this.price = price;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public Double getPrice() {
      return price;
   }
   
   public void setPrice(Double price) {
      this.price = price;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append(name + " , ");
      sb.append(String.format("%2f", price));
      return sb.toString();
   }
   
   @Override
   public int compareTo(Product o) {
      
      return price.compareTo(o.getPrice());
   }
}
