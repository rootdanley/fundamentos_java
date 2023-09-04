import java.util.Scanner;

public class vet01 {
  public static void main(String[] args){
    // Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
// e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite N: ");
    int n = sc.nextInt(); 
    int[] vetor = new int[n];

    for(int i = 0; i < vetor.length; i++){
      System.out.print("Digite um numero:");
      vetor[i] = sc.nextInt();
    }

    for(int element : vetor) {
      if(element < 0){
        System.out.println(element);
      }
    }
  }
}
