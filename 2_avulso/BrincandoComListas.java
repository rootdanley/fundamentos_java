package baguncinha;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BrincandoComListas {
  public static void main(String[] args){

    List<Integer> lista = new ArrayList<Integer>();

    for(int i = 0; i < 10; i++){
      lista.add(i);
      lista.add(33);
    }


    System.out.println(lista);

    lista.removeIf(x -> x.equals(33));

  }

}
