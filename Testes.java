import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Testes {
  public static void main(String[] args){

    // String usando sem instanciar, vao apontar para o mesmo espaço de memoria
    String nome = "Dan";
    String nome2 = "Dan";

    if(nome == nome2){
      System.out.println("É igual");
    }else{
      System.out.println("É diferente");
    }


    // Estanciando strings
    String nome3 = new String("Dan");
    String nome4 = new String("Dan");

    if(nome3 == nome4){
      System.out.println("É igual");
    }else{
      System.out.println("É diferente");
    }

    // Usando equals para comporar String estanciada
    if(nome3.equalsIgnoreCase(nome4)){
      System.out.println("É igual");
    }else{
      System.out.println("É diferente");
    }


    String faculdade = "UnilaSalle - A melhor faculdade de niteroi";
    String nova = faculdade.replace('a', 'x');
    System.out.println(nova);


    HashMap mapa = new HashMap();

    mapa.put("RM1223", "Danley");
    mapa.put("RM1224", "Katia");
    mapa.put("RM1225", "Maria");
    mapa.put("RM1226", "Maria Leticia");
    mapa.put("RM1227", "Maria do Carmo");


    System.out.println(mapa);
    System.out.println(mapa.get("RM1223"));
    System.out.println(mapa.remove("RM1224"));

    List<Integer> a = new ArrayList<Integer>();

    a.add(1);
    a.add(2);
    a.add(1999);

    for(Integer i : a){
      System.out.println(i);
      System.out.println("Tamhno: " + a.size());
    }

    
  }
}
