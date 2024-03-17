package pratica10.models;

import java.time.LocalDate;

public class Reserva {
   
   private Cliente cliente;
   private Quarto quarto;
   
   private LocalDate dataCheckIn;
   private LocalDate dataCheckOut;
   
   public Reserva(Cliente cliente, Quarto quarto, LocalDate dataCheckIn, LocalDate dataCheckOut) {
      this.cliente = cliente;
      this.quarto = quarto;
      this.dataCheckIn = dataCheckIn;
      this.dataCheckOut = dataCheckOut;
   }
   
   
   // Getters e métodos úteis
   public Cliente getCliente() {
      return cliente;
   }
   
   public Quarto getQuarto() {
      return quarto;
   }
   
   public LocalDate getDataCheckIn() {
      return dataCheckIn;
   }
   
   public LocalDate getDataCheckOut() {
      return dataCheckOut;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append("cliente=").append(cliente);
      sb.append(", quarto=").append(quarto);
      sb.append(", dataCheckIn=").append(dataCheckIn);
      sb.append(", dataCheckOut=").append(dataCheckOut);
      return sb.toString();
   }
}
