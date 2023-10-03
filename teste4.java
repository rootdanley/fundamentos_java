import java.util.Scanner;

public class teste4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de pessoas:");
    int pessoas = sc.nextInt();

    Pessoa[] pessoa = new Pessoa[pessoas];


    for(int i = 0; i < pessoa.length; i++) {
      System.out.print("Altura da pessoa :" + i + 1);
      double altura = sc.nextDouble();
      System.out.println("Genero da pessoa :" + i + 1);
      char sexo = sc.next().charAt(0);
      pessoa[i] = new Pessoa(altura, sexo);
    }

    for(int i = 0; i < pessoa.length; i++) {
      System.out.println(pessoa[i]);
    }
  }
}
