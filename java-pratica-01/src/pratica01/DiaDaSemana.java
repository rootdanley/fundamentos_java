package pratica01;
public enum DiaDaSemana {
   DOMINGO(1, false),
   SEGUNDA(2, true),
   TERCA(3, true),
   QUARTA(4, true),
   QUINTA(5, true),
   SEXTA(6, true),
   SABADO(7, false);
   
   private int valor;
   private boolean diaUtil;
   
   DiaDaSemana(int valor, boolean diaUtil) {
      this.valor = valor;
      this.diaUtil = diaUtil;
   }
   
   public int getValor() {
      return valor;
   }
   
   public boolean isDiaUtil() {
      return diaUtil;
   }
   
   public static DiaDaSemana porValor(int valor) {
      for (DiaDaSemana dia : DiaDaSemana.values()) {
         if (dia.getValor() == valor) {
            return dia;
         }
      }
      return null;
   }
}
