import java.util.Scanner;

public class vet03 {
  public static void main(String[] args){
//     Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor

    Scanner sc = new Scanner(System.in);

    int n = 0;

    System.out.println("Digite o número de números: ");
    n = sc.nextInt();

    double vetor[] = new double[n];
    double soma = 0.0;
    double media = 0.0;

    for(int i = 0; i < n; i++){
      System.out.println("Digite o número: ");
      vetor[i] = sc.nextDouble();
      soma += vetor[i];
    }
    media = soma / n;
    for(int i = 0; i < n; i++){
      System.out.println(vetor[i]);
    }
    System.out.println("Soma: " + soma);
    System.out.println("Média: " + media);
    sc.close();
    
  }
}
