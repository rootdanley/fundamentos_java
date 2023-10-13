package SomaNumerosApp;

public class Programa {
  public static void main(String[] args){
    SomaNumeros soma = new SomaNumeros();


    soma.addNumbers(30);

    soma.addNumbers(20);
    soma.addNumbers(10);

    soma.exibirNumeros();
    System.out.println("soma:");
    System.out.println(soma.calcularSoma());

    System.out.println("maior valor:");
    System.out.println(soma.encontrarMaiorValor());
  }
}
