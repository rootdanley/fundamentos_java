package pratica10;

import pratica10.enums.CategoriaQuarto;
import pratica10.models.Cliente;
import pratica10.models.Quarto;
import pratica10.models.Reserva;

import java.time.LocalDate;

public class Main10 {
   public static void main(String[] args) {
      
      Cliente cliente1 = new Cliente("Alice", "12345678900");
      Quarto quarto1 = new Quarto(101, CategoriaQuarto.SUITE, 300.00);
      
      Reserva reserva1 = new Reserva(cliente1, quarto1, LocalDate.of(2024, 3, 15), LocalDate.of(2024, 3, 20));
      
      System.out.println(reserva1);
   }
}
