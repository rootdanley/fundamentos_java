package ParImpar;

import java.util.ArrayList;
import java.util.List;

import ParImpar.entities.Pares;

public class ListaPares {
  private List<Pares> paresList;

  public ListaPares() {
    this.paresList = new ArrayList<Pares>();
  }

  public void addPares(Integer pares) {
    this.paresList.add(new Pares(pares));
  }

  public Integer totalPares(){
    int totalPares = 0;
    for(Pares pares : paresList){
      if(pares.getNumbers() % 2 == 0){
        totalPares++;
      }
    }
    return totalPares;
  }
}
