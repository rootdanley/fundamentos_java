package pratica06.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {
   private List<Contato> contatoList = new ArrayList<>();
   
   public Agenda() { }
   
   public void  addContato(Contato contato){
      contatoList.add(contato);
   }

   /*
      expressão lambda onde o cantoto é o parametro (um elemento da da lista contatoList) e o corpo da expressão verifica
      se o nome do contato é igual ao nome fornecido
    */
   public boolean removeContato(String nome) {
      return contatoList.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
   }
   
   public List<Contato> buscarPorNome(String nome) {
      return contatoList.stream()
          .filter(contato -> contato.getNome().equalsIgnoreCase(nome))
          .collect(Collectors.toList());
   }
   
   public void imprimirContatos() {
      contatoList.forEach(System.out::println);
   }
}
