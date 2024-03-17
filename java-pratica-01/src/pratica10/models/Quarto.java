package pratica10.models;

import pratica10.enums.CategoriaQuarto;

public class Quarto {
   private Integer numero;
   private CategoriaQuarto categoriaQuarto;
   private Double precoDiaria;
   
   
   public Quarto(Integer numero, CategoriaQuarto categoriaQuarto, Double precoDiaria) {
      this.numero = numero;
      this.categoriaQuarto = categoriaQuarto;
      this.precoDiaria = precoDiaria;
   }
   
   public Integer getNumero() {
      return numero;
   }
   
   public CategoriaQuarto getCategoriaQuarto() {
      return categoriaQuarto;
   }
   
   public Double getPrecoDiaria() {
      return precoDiaria;
   }
   
   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("Quarto{");
      sb.append("numero=").append(numero);
      sb.append(", categoriaQuarto=").append(categoriaQuarto);
      sb.append(", precoDiaria=").append(precoDiaria);
      sb.append('}');
      return sb.toString();
   }
}
