import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) throws FileNotFoundException {
      List<Product> productList = new ArrayList<>();
      
      String path = "/home/superbit/Documentos/fundamentos_java/generics-java-pratica-01/src/arquivo.txt";
      
      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         String line = br.readLine();
         while (line != null) {
            String[] fields = line.split(",");
            productList.add(new Product(fields[0], Double.parseDouble(fields[1])));
            line = br.readLine();
         }
         
         Product x = CalculationService.max(productList);
         System.out.println("max: ");
         System.out.println(x);
         
      } catch (IOException e) {
         System.out.println("error:" + e.getMessage());
      }
   }
}