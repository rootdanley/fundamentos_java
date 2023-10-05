package SalarioApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import SalarioApp.entities.Empregado;

public class Programa {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    List<Empregado> empregado = new ArrayList<Empregado>();

    System.out.printf("Quantos empregados serão registrados: ");
    int quantidade = sc.nextInt();

    for (int i = 0; i < quantidade; i++) {
      System.out.println("ID: ");
      int id = sc.nextInt();

      sc.nextLine(); // Limpeza do buffer de entrada
      System.out.println("Nome: ");
      String nome = sc.nextLine();

      System.out.println("Salário: ");
      double salary = sc.nextDouble();
      
      empregado.add(new Empregado(id, nome, salary));
    }

    System.out.println("Entre com o ID do funcionário: ");
    int id = sc.nextInt();

    boolean encontrado = false; // Variável para rastrear se o funcionário foi encontrado

    for(Empregado x : empregado){
      if(x.getId() == id){
        System.out.println("Entre com o percentual de aumento: ");
        double porcentagem = sc.nextDouble();
        x.setSalario(x.getSalario() + (porcentagem / 100.0 * x.getSalario()));
        encontrado = true; // Define como true se o funcionário for encontrado
        break; // Sai do loop após encontrar o funcionário
      }
    }

    if (!encontrado) {
      System.out.println("Não encontrado");
    }


    System.out.println(empregado);
  }
}
