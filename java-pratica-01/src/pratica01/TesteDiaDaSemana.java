package pratica01;

import java.util.Scanner;


public class TesteDiaDaSemana {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Digite um número de 1 a 7 para obter o dia da semana correspondente:");
      int numero = scanner.nextInt();
      
      DiaDaSemana dia = DiaDaSemana.porValor(numero);
      
      if (dia != null) {
         System.out.println("Dia da semana: " + dia);
         System.out.println("É dia útil? " + (dia.isDiaUtil() ? "Sim" : "Não"));
      } else {
         System.out.println("Número inválido. Por favor, digite um número de 1 a 7.");
      }
   }
}