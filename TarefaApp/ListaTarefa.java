package TarefaApp;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    this.tarefaList.add(new Tarefa(descricao));
  } // estou dizendo que vou instanciar uma nova tarefa dentro da lista


 
  // removendo tarefas usando expressao lambda(predicado)
 public void removerTarefa2(String descricao) {
    this.tarefaList.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
  }
 
  // removendo usando loop for each e uma nova lista
  public void removerTarefa(String descricao) {
    List<Tarefa> remover = new ArrayList<Tarefa>();
    for(Tarefa lisTarefa : tarefaList) {
      if(lisTarefa.getDescricao().equalsIgnoreCase(descricao)) {
        remover.add(lisTarefa);
      }
    }
    this.tarefaList.removeAll(remover);
   }



 public Integer obterNumeroTotalDeTarefas(){
  return this.tarefaList.size();
 }



  public void exibirTarefas() {
    for(Tarefa lisTarefa : tarefaList) {
      System.out.println(lisTarefa.getDescricao());
    }
  }
}

