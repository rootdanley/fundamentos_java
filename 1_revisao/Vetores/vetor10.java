package Revisao.Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class vetor10 {
  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);


    System.out.printf("Quantas pessoas voce vai digitar?");
    int quantidade = sc.nextInt();
    sc.nextLine(); // Consumir a quebra de linha

    String[] nome = new String[quantidade];
    Integer[] idade = new Integer[quantidade];

    for(int i = 0; i < nome.length; i++){
      System.out.printf("Digite o nome da %dª pessoa: ", i + 1);
      nome[i] = sc.nextLine();
      System.out.printf("Digite a idade da %dª pessoa: ", i + 1);
      idade[i] = sc.nextInt();
      sc.nextLine(); // Consumir a quebra de linha
    }

    System.out.println(Arrays.toString(nome));




    for(int i = 1; i < idade.length; i++) {
      if(idade[i] > idade[ i - 1]){
        System.out.println(nome[i]);
      }
    }
  }



}
