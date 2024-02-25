package services;

import java.util.List;

public class CalculationService {

//   operacao static, sendo assim nao precisamos instanciar CalculationService
   public static <T extends Comparable<T>> T max(List<T> list) {
      if (list.isEmpty()) {
         throw new IllegalStateException("lista esta vazia!");
      }
      T max = list.get(0);
      for (T item : list) {
         if (item.compareTo(max) > 0) {
            max = item;
         }
      }
      return max;
   }
}
