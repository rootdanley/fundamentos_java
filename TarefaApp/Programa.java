package TarefaApp;

public class Programa {
  public static void main(String[] args){
    ListaTarefa tarefaList = new ListaTarefa();

    System.out.println(tarefaList.obterNumeroTotalDeTarefas());
    tarefaList.adicionarTarefa("Viajar");
    tarefaList.adicionarTarefa("Dormir");
    tarefaList.adicionarTarefa("Viajar");

    tarefaList.adicionarTarefa("estudar java");
    tarefaList.adicionarTarefa("estudar angular");
    tarefaList.adicionarTarefa("estudar provas");

    System.out.println(tarefaList.obterNumeroTotalDeTarefas());
    tarefaList.removerTarefa("viajar");
    System.out.println(tarefaList.obterNumeroTotalDeTarefas());
    tarefaList.exibirTarefas();
  }
}
