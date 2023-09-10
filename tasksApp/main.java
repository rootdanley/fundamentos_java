package tasksApp;

import java.util.Scanner;

import tasksApp.entities.Tasks;

public class main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Tasks tarefas = new Tasks(10);

    do {
      System.out.println("Escolha uma opção: (1 - add tarefas) (2 - remove tarefas) (3 - Listar Tarefas) (4 - Sair)");
      int opcao = scanner.nextInt();
      scanner.nextLine(); // Consumir a nova linha pendente quando consumimos um int

      switch (opcao) {
        case 1:
          System.out.println("Digite o nome da tarefa:");
          String nome = scanner.nextLine();
          tarefas.addTask(nome);
          break;

        case 2:
          System.out.println("Digite a posição da tarefa a ser removida:");
          int posicaoRemover = scanner.nextInt();
          scanner.nextLine(); // Consumir a nova linha pendente
          tarefas.removeTask(posicaoRemover);
          break;
        case 3:
          tarefas.listTasks();
          break;
        case 4:
          System.out.println("Saindo do programa.");
          scanner.close();
          return; // Sai do loop e encerra o programa
        default:
          System.out.println("Opção inválida!");
      }
    } while (true);
  }
}
