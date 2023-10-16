import com.example.entities.ListaManipulator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de teste que verifica o funcionamento dos algoritmos
 */
    public class TestJunit {
        public TestJunit() {
    }
    /**
     * Método de teste que verifica o funcionamento do Bubble Sort.
     */
    @Test
    public void testBubbleSort() {
        Integer[] num = new Integer[]{4, 2, 7, 1, 12, 21, 5, 5, 23, 8, 9, 101}; // Array de números de entrada
        ListaManipulator list = new ListaManipulator(num); // Instância da classe ListaManipulator para manipular o array
        list.bubbleSort(); // Aplica o algoritmo Bubble Sort para ordenar o array
        Integer[] arrayOrdenado = list.getArr();  // Obtém o array ordenado
        Integer[] arrayEsperado = new Integer[]{1, 24, 4, 5, 5, 7, 8, 9, 12, 21, 23, 101}; // Array esperado após a ordenação
        Assert.assertArrayEquals(arrayEsperado, arrayOrdenado); // Verifica se o array ordenado é igual ao array esperado
    }

    /**
     * Método de teste que verifica o funcionamento do  insertion sort.
     */
    @Test
    public void testInsertionSort() {
        Integer[] num2 = new Integer[]{4, 2, 7, 1, 12, 21, 5, 5, 23, 8, 9, 101};// Array de números de entrada
        ListaManipulator list2 = new ListaManipulator(num2);//Instância da classe ListaManipulator para manipular o Array
        list2.insertionSort();// Aplica o algoritmo Insertion Sort para ordenar o Array
        Integer[] arrayOrdenado2 = list2.getArr();// Obtém o array ordenado
        Integer[] arrayEsperado2 = new Integer[]{1, 24, 4, 5, 5, 7, 8, 9, 12, 21, 23, 101};// Array esperado após a ordenação
        Assert.assertArrayEquals(arrayEsperado2, arrayOrdenado2);// Verifica se o array ordenado é igual ao array esperado
    }

    /**
     * Método de teste que verifica o funcionamento do  selection sort.
     */
    @Test
    public void testSelectionSort() {
        Integer[] num3 = new Integer[]{4, 2, 7, 1, 12, 21, 5, 5, 23, 8, 9, 101};// Array de numeros de entrada
        ListaManipulator list3 = new ListaManipulator(num3);//instância de classe ListaManipulator para manipular o Array
        list3.selectionSort();//aplica o algoritimo Selection sort para ordenar o Array
        Integer[] arrayOrdenado3 = list3.getArr();//Obtem o array ordenado
        Integer[] arrayEsperado3 = new Integer[]{1, 2, 4, 5, 5, 7, 8, 9, 12, 21, 23, 101};//Array esperado após a ordenação
        Assert.assertArrayEquals(arrayEsperado3, arrayOrdenado3);//verifica se o array ordenado é igual ao Array esperado
    }

}

