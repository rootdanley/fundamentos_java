package Pratica.Lista.PraticaLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Funcionarios> listaFuncionarios = new ArrayList<>();

    System.out.println("How many employees will be registered?");
    int n = sc.nextInt();

    for (int indice = 1; indice <= n; indice++) {
      System.out.println("Digite o ID: ");
      int id = sc.nextInt();
      sc.nextLine();
      System.out.println("Digite o nome: ");
      String name = sc.nextLine();
      System.out.println("Digite o salario:");
      double salario = sc.nextDouble();

      listaFuncionarios.add(new Funcionarios(id, name, salario));
    }

    System.out.println("List of employees registered");
    for (Funcionarios f : listaFuncionarios) {
      System.out.println(f);
    }

    // Agora, você pode editar um funcionário específico na lista, se necessário
    System.out.println("Enter the ID of the employee you want to edit:");
    int idToEdit = sc.nextInt();

    for (Funcionarios f : listaFuncionarios) {
      if (f.getId() == idToEdit) {
        System.out.println("Enter the new name:");
        sc.nextLine(); // Consumir a quebra de linha pendente
        String newName = sc.nextLine();
        System.out.println("Enter the new salary:");
        double newSalary = sc.nextDouble();

        f.setName(newName);
        f.setSalary(newSalary);

        System.out.println("Employee edited successfully.");
        break; // Parar de procurar depois de encontrar o funcionário com o ID correto
      } else {
        System.out.println("Employee not found.");
      }
    }

    System.out.println("Updated list of employees:");
    for (Funcionarios f : listaFuncionarios) {
      System.out.println(f);
    }
  }
}
