package Faculdade;

import Faculdade.entities.ListaManipulator;
import Faculdade.utils.ImprimirArr;

public class Programa {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 1, 12, 55, 5, 5};
        
       
        ListaManipulator manipulator = new ListaManipulator(arr);
        manipulator.bubbleSort();
        Integer[] arrayOrdenadoBubbleSort = manipulator.getArr();
        manipulator.insertionSort();
        Integer[] arrayOrdenadoInsertionSort = manipulator.getArr();
        manipulator.selectionSort();
        Integer[] arrayOrdenadoSelectionSort= manipulator.getArr();

        System.out.println("Selection Sort");
        ImprimirArr.printArray(arrayOrdenadoSelectionSort);

        System.out.println("Bubble Sort");
        ImprimirArr.printArray(arrayOrdenadoBubbleSort);

        System.out.println("InsertionSort");
        ImprimirArr.printArray(arrayOrdenadoInsertionSort);
        
       /*
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

        */
   
    }
}

