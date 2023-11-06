package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("posicao invalida");
        }catch (InputMismatchException e) {
            System.out.println("tipo de dados invalido");
        }

        System.out.println("fim!!!");

        sc.close();
    }
}