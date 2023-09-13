package Examples.lacoFor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

  

    try {
      System.out.println("1:");
      int numero1 = sc.nextInt();
      System.out.println("2:");
      int numero2 = sc.nextInt();
      int divisao = numero1 / numero2;
      System.out.println("o resultado: " + divisao);
    } catch (ArithmeticException Error) {
      System.err.println("Erro ao dividir");
    } catch (InputMismatchException Error) {
      System.err.println("Erro de entrada de dados");
    } finally {
      System.out.println("Programa Finalizado");
    }

    sc.close();

  }
}
