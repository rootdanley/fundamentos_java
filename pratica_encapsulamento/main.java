package pratica_encapsulamento;

import java.util.Scanner;

public class main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Conta conta;

    System.out.println("Enter account number:");
    int number = sc.nextInt();
    System.out.println("Enter account holder:");
    sc.nextLine(); // ADICIONAMOS O NEXTLINE PURO PQ FICOU PENDENTE A QUEBRA DE LINHA NO NEXT INT ANTERIOR
    String holder = sc.nextLine();
    System.out.println("is there an initial deposit?");
    char response = sc.next().charAt(0);


    if(response == 'y' || response == 'Y'){
      System.out.print("Enter inital deposit:");
      double initialDeposit = sc.nextDouble();
      conta = new Conta(number, holder, initialDeposit);
    }else {
      conta = new Conta(number, holder);
    }

    System.out.println("Account data:");
    System.out.println(conta);

    System.out.println("Enter a deposit amount: ");
    double amount = sc.nextDouble();
    conta.deposit(amount);

    System.out.println("Account Update data:");
    System.out.println(conta);


    System.out.println("Enter a withdrawal amount: ");
    double withdrawalAmount = sc.nextDouble();

    conta.withdraw(withdrawalAmount);
    System.out.println("Account Update data:");
    System.out.println(conta);



    sc.close();
  }
}
