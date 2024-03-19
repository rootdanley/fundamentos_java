package pratica14.models;

import java.util.Arrays;

public class Fila<T> {
   
   final public static int TAMANHO_INICIAL = 3;
   final public static int FATOR_CRESCIMENTO = 5;
   
   private T[] arrayInterno;
   private int numElementos;
   
   public Fila() {
      this.numElementos = 0;
      this.arrayInterno = (T[]) new Object[TAMANHO_INICIAL];
   }
   
   public void push(T novo) {
      if (this.numElementos == this.arrayInterno.length) {
         this.arrayInterno = Arrays.copyOf(this.arrayInterno, this.numElementos + FATOR_CRESCIMENTO);
      }
      this.arrayInterno[numElementos] = novo;
      this.numElementos++;
   }
   
   public T pop() {
      if (this.numElementos == 0) {
         return null;
      }
      
      T valorRetorno = this.arrayInterno[0];
      for (int i = 0; i < this.numElementos - 1; i++) {
         this.arrayInterno[i] = this.arrayInterno[i + 1];
      }
      this.numElementos--;
      this.arrayInterno[numElementos] = null;
      
      return valorRetorno;
   }
   
   public int getNumElementos() {
      return this.numElementos;
   }
}



