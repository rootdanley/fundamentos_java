import java.util.Scanner;

import entities.Pensao;

public class Program {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    
    System.out.println("How many rooms will be rented? ");
    int rooms = sc.nextInt();
    Pensao[] p = new Pensao[10];


    for(int i=0; i < rooms; i++){
      System.out.println("Rent #" + i + 1);

      System.out.println("Qual o quarto desejado?");
      int quarto = sc.nextInt();
      if(p[quarto] != null){

        System.out.println("Quarto já ocupado!");
        continue;
      }

      sc.nextLine();
      System.out.print("Nome: ");
      String nome = sc.nextLine();

      System.out.print("Email:");
      String email = sc.nextLine();

      p[quarto] = new Pensao(nome, email);
    }

    System.out.println("Busy rooms:");
    for(int i=0; i < p.length; i++){

      if( p[i] != null) {
        System.out.println();
        
        System.out.print(i + ": " + p[i].getName() + ", " + p[i].getEmail());
      }
      
    }

 

  }
}
