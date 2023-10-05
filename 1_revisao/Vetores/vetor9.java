package Revisao.Vetores;

import java.util.Scanner;
import Revisao.Vetores.entities.Alunos;

public class vetor9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de alunos:");
    int numAlunos = sc.nextInt();
    sc.nextLine(); // Consumir a quebra de linha

    Alunos[] alunos = new Alunos[numAlunos];

    for (int i = 0; i < alunos.length; i++) {
      System.out.printf("Digite o nome do %dº aluno: ", i + 1);
      String nome = sc.nextLine();

      Double[] notas = new Double[2];
      System.out.printf("Digite a primeira nota do %dº aluno: ", i + 1);
      notas[0] = sc.nextDouble();
      System.out.printf("Digite a segunda nota do %dº aluno: ", i + 1);
      notas[1] = sc.nextDouble();

      sc.nextLine(); // Consumir a quebra de linha
      alunos[i] = new Alunos(nome, notas);
    }

    System.out.println("Alunos aprovados:");
    for (int i = 0; i < alunos.length; i++) {
      if (alunos[i].mediaNotas() >= 6) {
        System.out.println(alunos[i].getNome());
        System.out.println(alunos[i].mediaNotas());
      }
    }
  }
}
