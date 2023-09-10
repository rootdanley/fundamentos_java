package Lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Pograma {
  public static void main(String[] args) {

    List<Integer> lista = new ArrayList<>();
    // precisamos instancia a lista
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(5);

    System.out.println(lista);

    for (int element : lista) {
      System.out.println(element);
    }

    System.out.println("--------------------------------");
    List<String> listaDeNomes = new ArrayList<>();

    listaDeNomes.add("Joao");
    listaDeNomes.add("Maria");
    listaDeNomes.add("Pedro");
    listaDeNomes.add("Canley");
    listaDeNomes.add("Barbara");
    listaDeNomes.add("Carla");
    listaDeNomes.add("Coselito");
    listaDeNomes.add("Carteman Carla");

    for (String element : listaDeNomes) {
      System.out.println(element);
    }

    // estou adicionando o nome danley na posicao 0
    listaDeNomes.add(0, "Danley e brabo");
    System.out.println("--------------------------------");

    for (String element : listaDeNomes) {
      System.out.println(element);
    }

    System.out.println("--------------------------------");

    listaDeNomes.size();

    // removendo por nome
    listaDeNomes.remove("Pedro");
    // removendo por index(posicao)
    listaDeNomes.remove(0);

    // Predicado para remover todos o nomes que começam com C(Maisculo)
    listaDeNomes.removeIf(x -> x.charAt(0) == 'C');

    for (String indice : listaDeNomes) {
      System.out.println(indice);
    }

    System.out.println(listaDeNomes);

    System.out.println("Index of Barbara: " + listaDeNomes.indexOf("Barbara"));

    // estamos fazendo um filtro e armazenando na nova lista os nomes que começam
    // com 'M'
    List<String> result = listaDeNomes.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

    System.out.println(result);
    System.out.println("--------------------------------");

    List<String> listaDeNomes2 = new ArrayList<>();
    listaDeNomes2.add("João");
    listaDeNomes2.add("Maria");
    listaDeNomes2.add("José");
    listaDeNomes2.add("Ana");

    listaDeNomes2.removeIf(x -> x.charAt(0) == 'J');
    System.out.println(listaDeNomes2);

  }
}
