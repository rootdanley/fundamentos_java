package org.example;

import org.example.models.entities.Account;
import org.example.models.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Account account = null;
        try {
            System.out.println("Enter account data");
            System.out.print("Number:");
            int number = sc.nextInt();

            sc.nextLine();

            System.out.print("Holder:");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdraw = sc.nextDouble();

            account = new Account(number, holder, balance, withdraw);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);


        } catch (DomainException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(account);
        }


    }
}