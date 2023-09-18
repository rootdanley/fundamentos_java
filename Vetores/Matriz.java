package Vetores;

import java.util.Scanner;

public class Matriz {
  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de linhas: ");
    int linhas = sc.nextInt();
    System.out.println("Digite a quantidade de colunas: ");
    int colunas = sc.nextInt();

    int[][] matriz = new int[linhas][colunas];
    
    System.out.println("Digite numero: ");
    int number = sc.nextInt();

    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        System.out.println("Digite Elemento: " + i + " " + j);
        int x = sc.nextInt();
        matriz[i][j] = x;
      }
    }

    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        System.out.print(matriz[i][j]);
      }
      System.out.println();
    }

    int esquerda;
    int cima; 
    int direita;
    int abaixo;

    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        if(matriz[i][j] == number){
          esquerda = i;
          cima = j;
        }
      }

    }

    
  }
}
