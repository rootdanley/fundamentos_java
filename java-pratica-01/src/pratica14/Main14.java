package pratica14;

import pratica14.models.Fila;

import java.util.Random;
import java.util.Scanner;

public class Main14 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Fila<String> fila = new Fila<>();
      Random random = new Random();
      
      while (true) {
         System.out.println("\nENTRE COM A OPÇÃO DESEJADA");
         System.out.println("============================");
         System.out.println("[1] Emitir Nova Senha");
         System.out.println("[2] Chamar Próximo da Fila");
         System.out.println("[3] Fim");
         
         String opcao = scanner.nextLine();
         
         switch (opcao) {
            case "1":
               char c = (char) (random.nextInt('Z' - 'A' + 1) + 'A');
               int num1 = random.nextInt(10);
               int num2 = random.nextInt(10);
               String senha = "SENHA " + c + num1 + num2;
               fila.push(senha);
               System.out.println("Nova senha emitida: " + senha);
               break;
            case "2":
               String atendido = fila.pop();
               if (atendido == null) {
                  System.out.println("A fila está vazia.");
               } else {
                  System.out.println("Chamando: " + atendido);
               }
               break;
            case "3":
               System.exit(0);
               break;
            default:
               System.out.println("Opção inválida.");
         }
      }
   }
}