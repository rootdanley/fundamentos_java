package Revisao.Vetores;

import java.util.Scanner;

public class vetor11 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("quantos numeros vai digitar? ");
    int quantidade = sc.nextInt();



    Integer[] vetor = new Integer[quantidade];

    for(int i=0; i<vetor.length; i++){
      System.out.printf("Digite o numero %d: ", i+1);
      vetor[i] = sc.nextInt();
      sc.nextLine(); // consumir quebra de linha
     
    }


    System.out.println("NUMEROS PARES:");
    for(int i=0; i<vetor.length; i++){
        if(vetor[i] % 2 == 0){
        
        System.out.println(vetor[i]);
      }
    }



  }
}
