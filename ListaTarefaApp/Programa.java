package ListaTarefaApp;

import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ListaTarefa listaTarefa = new ListaTarefa();

    for (int i = 0; i < 3; i++) {
      System.out.println("Digite a descrição da tarefa: ");
      String descricao = sc.nextLine();
      listaTarefa.adicionarTarefa(descricao);
    }
    
    listaTarefa.imprimirLista();

    System.out.println(listaTarefa.obterNumeroTotalDeTarefas());
  }
}
