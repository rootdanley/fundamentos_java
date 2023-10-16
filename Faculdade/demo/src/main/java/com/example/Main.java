
package com.example;

import com.example.entities.ListaManipulator;
import com.example.utils.ImprimirArr;
/**
 * A Classe realiza a ordenação de um array de inteiros, usando diferentes algoritmos para ordena-lo.
 * Ordenação do array usando: Bubble Sort, Insertion Sort, Selection Sort e fazendo a busca binária, imprimindo seus
 * valores.
 * @author Nathan Farias
 * @author Danley Alves
 * @author João Vitor Braga
 * @version 1.1S
 */

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        /**
        * Esse é um programa que ordena o array e realiza uma busca binária.
        * @param args Argumentos da linha de comando.
        */

        // Cria um array de Integers desordenados
        Integer[] arr = new Integer[]{4, 2, 7, 1, 12, 21, 5, 5, 23, 8, 9, 101};
        Integer numero = 101;

        // Executa o Bubble Sort no array
        ListaManipulator manipulatorBubbleSort = new ListaManipulator(arr);
        manipulatorBubbleSort.bubbleSort();
        Integer[] arrayOrdenadoBubbleSort = manipulatorBubbleSort.getArr();
        System.out.println("Bubble Sort");
        ImprimirArr.printArray(arrayOrdenadoBubbleSort);

        // Executa o Insertion Sort no array
        ListaManipulator manipulatorInsertionSort = new ListaManipulator(arr);
        manipulatorInsertionSort.insertionSort();
        Integer[] arrayOrdenadoInsertionSort = manipulatorInsertionSort.getArr();
        System.out.println("Insertion Sort");
        ImprimirArr.printArray(arrayOrdenadoInsertionSort);

        // Executa o Selection Sort no array
        ListaManipulator manipulatorSelectionSort = new ListaManipulator(arr);
        manipulatorSelectionSort.selectionSort();
        Integer[] arrayOrdenadoSelectionSort = manipulatorSelectionSort.getArr();
        System.out.println("Selection Sort");
        ImprimirArr.printArray(arrayOrdenadoSelectionSort);

        // Realiza uma busca binária no array e imprime o resultado
        System.out.println(manipulatorBubbleSort.buscaBinaria(arr, numero));
    }
}