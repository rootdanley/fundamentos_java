package com.example.utils;
/**
 * Classe que fornece um método para imprimir um array de Integers.
 */

public class ImprimirArr {
    /**
     * Imprime os elementos de um array no console.
     * @param arr O array de Integers a ser impresso.
     */
  public static void printArray(Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        if (i < arr.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println(); 
  }
}
