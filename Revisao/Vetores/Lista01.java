package Revisao.Vetores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Revisao.Vetores.entities.AltPessoa;

public class Lista01 {
//    Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//    que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//    de homens. 
  /**
   * @author danley alves
   */
  public static void main(String[] args){


    Scanner sc = new Scanner(System.in);


    List<AltPessoa> altPessoa = new ArrayList();

    System.out.println("Quantas pessoas?:");
    int quantidade = sc.nextInt();

    for(int i = 0; i < quantidade; i++){
      System.out.printf("Altura da pessoa: #%d", i);
      double altura = sc.nextDouble();

      System.out.printf("Genero da pessoa: #%d", i);
      char genero = Character.toUpperCase(sc.next().charAt(0));
      
      int genFem = 0;
      if(genero == 'F'){
        genFem++;
      }
      altPessoa.add(new AltPessoa(altura, genero));
      
  }

  System.out.println(altPessoa);
}
}
