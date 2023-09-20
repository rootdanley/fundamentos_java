import java.util.ArrayList;
import java.util.List;

import entities.Palavras;

public class Program {

  // @author: danley alves
  
  public static void main(String[] args){
    List<Palavras> palavras = new ArrayList<Palavras>();

    
    palavras.add(new Palavras("Qual é o pinguim mascote do Linux?", "tux"));
    palavras.add(new Palavras("Qual é o daemon responsável pelo agendamento de tarefas no Linux?", "cron"));


    System.out.println(palavras);
  }
}
