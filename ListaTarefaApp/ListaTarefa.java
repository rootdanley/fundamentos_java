package ListaTarefaApp;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<Tarefa>();
  }

  public void adicionarTarefa(String descricao){
    this.tarefaList.add(new Tarefa(descricao));
  }


  public void removerTarefa(String descricao){
    List<Tarefa> removerTarefasList = new ArrayList<Tarefa>(); // criei uma lista para armazenar as tarefas repetidas dentro da lista principal
    for(Tarefa tarefa : this.tarefaList){
      if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
        removerTarefasList.add(tarefa);
      }
    }

    this.tarefaList.removeAll(removerTarefasList); // a partir da lista que de removerTarefasList estamos removendo da lista principal

  }

  public int obterNumeroTotalDeTarefas(){
    return this.tarefaList.size();
  }

  public void imprimirLista(){
    System.out.println(tarefaList);
  }

}

