import java.util.Scanner;

public class teste2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    


    System.out.println("Numero de pessoas:");
    int pessoas = sc.nextInt();

    double[] altura = new double[pessoas];
    double soma = 0.0;

    for(int i = 0; i < altura.length; i++){
      System.out.println("Digite a altura da pessoa " + (i + 1) + ":");
      altura[i] = sc.nextDouble();
      soma += altura[i];
    }

    System.out.println("A media das alturas é: " + (soma / pessoas));
  }
}
