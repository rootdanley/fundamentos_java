package entities;

public class Department {
   private String name;
   
   public Department() {
   
   }
   
   public Department(String name) {
      this.name = name;
   }
   
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Department{");
      sb.append("name='").append(name).append('\'');
      sb.append('}');
      return sb.toString();
   }
}
