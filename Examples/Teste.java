package Examples;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String teste = new String();
    String test;

    System.out.println("Digite nome: ");
    test = sc.nextLine();

    System.out.println("Digite sobrenome: ");
    teste = sc.nextLine();

    System.out.println("Nome: " + test);
    System.out.println("Sobrenome: " + teste);
    


  }
}
