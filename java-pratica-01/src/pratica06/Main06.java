package pratica06;

import pratica06.models.Agenda;
import pratica06.models.Contato;

import java.util.List;

public class Main06 {
   public static void main(String[] args) {
      Agenda agenda = new Agenda();
      
      // Adicionando alguns contatos
      agenda.addContato(new Contato("Alice", "alice@example.com", "1234-5678"));
      agenda.addContato(new Contato("Bob", "bob@example.com", "9876-5432"));
      
      System.out.println("Todos os contatos:");
      agenda.imprimirContatos();
      
      // Buscando um contato
      System.out.println("\nBuscando contato 'Alice':");
      List<Contato> encontrados = agenda.buscarPorNome("Alice");
      encontrados.forEach(System.out::println);
      
      // Removendo um contato e imprimindo a lista atualizada
      System.out.println("\nRemovendo contato 'Alice' e listando contatos restantes:");
      agenda.removeContato("Alice");
      agenda.imprimirContatos();
   }
}
