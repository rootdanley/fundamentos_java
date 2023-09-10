package Vetores;

import java.util.Scanner;

import Vetores.entities.Pessoas;

public class vet04 {
  public static void main(String[] args) {
    // Fazer um programa para ler nome, idade e altura de N pessoas, conforme
    // exemplo. Depois, mostrar na
    // tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
    // com menos de 16 anos,
    // bem como os nomes dessas pessoas caso houver.
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o número de pessoas: ");
    int n = leia.nextInt();

    Pessoas[] vetPessoas = new Pessoas[n];
    double sum = 0.0;
    int idadeMenor = 0;
    String[] nomes = new String[n];

    for (int i = 0; i < vetPessoas.length; i++) {
      System.out.println("Digite o nome: ");
      String nome = leia.next();

      System.out.println("Digite a idade: ");
      int idade = leia.nextInt();

      if (idade < 16) {
        idadeMenor++;
        nomes[i] = nome;
      }

      System.out.println("Digite a altura: ");
      Double altura = leia.nextDouble();

      sum += altura; // soma das alturas para media
      vetPessoas[i] = new Pessoas(nome, idade, altura);
    }

    double porcentagemMenor = ((double) idadeMenor / n) * 100;
    System.out.println("Porcentagem de pessoas com menos de 16 anos: " + porcentagemMenor);
    for (String nomesMenors : nomes) {
      System.out.println(nomesMenors);
    }
    System.out.println("Altura média: " + sum / n);
  }

}
