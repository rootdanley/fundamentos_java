package Faculdade;

import Faculdade.entities.ListaManipulator;
import Faculdade.utils.ImprimirArr;

/**
 * Esta classe representa o programa principal que manipula e ordena uma matriz de números inteiros
 * usando os algoritmos de ordenação Bubble Sort, Insertion Sort e Selection Sort.
 */
public class Programa {
    /**
     * O método principal que inicia a execução do programa.
     */
    public static void main(String[] args) {
        // Inicializa uma array de números inteiros.
        Integer[] arr = {4, 2, 7, 1, 12, 21, 5, 5,23,8,9,101};
        Integer numero = 101;

        // Cria uma instância do manipulador de lista com o array fornecida.
        ListaManipulator manipulator = new ListaManipulator(arr);

        // Aplica o algoritmo Bubble Sort ao array.
        manipulator.bubbleSort();
        Integer[] arrayOrdenadoBubbleSort = manipulator.getArr();

        // Aplica o algoritmo Insertion Sort ao array.
        manipulator.insertionSort();
        Integer[] arrayOrdenadoInsertionSort = manipulator.getArr();

        // Aplica o algoritmo Selection Sort ao array.
        manipulator.selectionSort();
        Integer[] arrayOrdenadoSelectionSort = manipulator.getArr();

        // Imprime a array ordenada usando Selection Sort.
        System.out.println("Selection Sort");
        ImprimirArr.printArray(arrayOrdenadoSelectionSort);

        // Imprime a array ordenada usando Bubble Sort.
        System.out.println("Bubble Sort");
        ImprimirArr.printArray(arrayOrdenadoBubbleSort);

        // Imprime a array ordenada usando Insertion Sort.
        System.out.println("Insertion Sort");
        ImprimirArr.printArray(arrayOrdenadoInsertionSort);

        System.out.printf("num: %d,Utilizando Busca Binaria foi encontrado no Indice:", numero);
        System.out.println(manipulator.buscaBinaria(arr, numero));

    }
}
