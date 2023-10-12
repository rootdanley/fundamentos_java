package Faculdade;

import Faculdade.entities.ListaManipulator;
import Faculdade.utils.ImprimirArr;

public class Programa {
    public static void main(String[] args) {
      Integer[] arr = {4, 2, 7, 1, 12, 21, 5, 5,23,8,9,101};
      Integer numero = 101;
      Integer[] desordenado = {3,12,3,5,1,32,5,55}; 
        
      ListaManipulator manipulator = new ListaManipulator(desordenado);
    
        ListaManipulator manipulatorBubbleSort = new ListaManipulator(arr);
        manipulatorBubbleSort.bubbleSort();
        Integer[] arrayOrdenadoBubbleSort = manipulatorBubbleSort.getArr();
        System.out.println("Bubble Sort");
        ImprimirArr.printArray(arrayOrdenadoBubbleSort);


        ListaManipulator manipulatorInsertionSort = new ListaManipulator(arr);
        manipulatorInsertionSort.insertionSort();
        Integer[] arrayOrdenadoInsertionSort = manipulatorInsertionSort.getArr();
        System.out.println("Insertion Sort");
        ImprimirArr.printArray(arrayOrdenadoInsertionSort);

        ListaManipulator manipulatorSelectionSort = new ListaManipulator(arr);
        manipulatorSelectionSort.insertionSort();
        Integer[] arrayOrdenadoSelectionSort= manipulatorSelectionSort.getArr();
        System.out.println("Selection Sort");
        ImprimirArr.printArray(arrayOrdenadoSelectionSort);

        
        System.out.println(manipulator.buscaBinaria(desordenado, numero));
   
    }
}

