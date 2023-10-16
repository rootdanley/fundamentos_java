package com.example.entities;

import com.example.utils.ValorInvalidoException;

/**
 * Esse é um programa que dado os valores do array, retorna ordenadamente e faz a busca.
 */

public class ListaManipulator {

    // Array que será manipulado
    private Integer[] arr;

    /**
     * Construtor da classe ListaManipulator.
     * @param arr O array que será manipulado.
     */
    public ListaManipulator(Integer[] arr) {
        this.arr = arr;
    }

    /*
    *   Construtor vazio sem parametros
    *
     */
    public ListaManipulator(){}

    /**
     * Obtém o array atualmente armazenado na instância.
     *
     * @return O array de Integers atual.
     */
    public Integer[] getArr() {
        return arr;
    }

    /**
     * Define um novo array para ser manipulado.
     *
     * @param arr O novo array a ser armazenado e manipulado.
     */
    public void setArr(Integer[] arr) {
        this.arr = arr;
    }

    /**
     * Esse é um método que ordena o array, usando o algoritmo Bubble Sort
     * O Bubble compara elementos adjacentes e troca de posição se estiverem fora de ordem
     */
    public void bubbleSort() {
      for(int i=0;i<arr.length;i++){//FOR i para percorrer as posições
        for(int j=0;j<arr.length-1;j++){//FOR j para comparar com a posição seguinte 
          if(arr[j]>arr[j+1]){//SE posição de j é maior do que a posição após ele
             int aux = arr[j+1];//aux recebe a posição secudária, que vem após ele
             arr[j+1] = arr[j];//posição secundária recebe o valor anterior a ele
             arr[j] = aux;//posição principal recebe aux(posição secundária)
          }
        }
      }
    }

    /**
     * Esse é um método que ordena o array, usando o algoritmo Insertion Sort
     * O Insertion Sort constrói a lista ordenada um elemento de cada vez,
     * movendo os elementos maiores para a direita até encontrar a posição correta para inserir um elemento.
     */

    // Método para realizar a ordenação do array usando o algoritmo insertion sort
    public void insertionSort() {
      int maior = -9999; // Variável para rastrear o maior valor encontrado
      int imaior = 0; // Variável para rastrear o índice do maior valor

        // For para encontrar o maior valor no array
        for(int i=0;i<=arr.length-1;i++){
         if(arr[i] > maior){
            imaior = i; // Se o valor atual (arr[i]) for maior que o valor atualmente rastreado (maior),
            maior= arr[i]; // atualize o maior valor e o índice do maior valor
         }
      }
      int aux = arr[arr.length-1]; // Armazene o valor do último elemento do array em uma variável auxiliar
      arr[arr.length-1] = maior; // Substitua o último elemento do array pelo maior valor encontrado
      arr[imaior] = aux; // Substitua o elemento no índice do maior valor encontrado pelo valor armazenado em aux
    }


    /**
     * Esse é um método que ordena o array, usando o algoritmo Selection Sort
     * O Selection Sort encontra o elemento mínimo da lista e o coloca na primeira posição,
     * repetindo esse processo para o restante da lista até que todos os elementos estejam ordenados.
     */
  public void selectionSort(){//método para ordenar Selection
    int aux;//armazenar o elemento do vetor
    int menor;//armazena o menor elemento
    
    for(int i=0;i<arr.length;i++){//FOR i para percorrer as posições
      menor = i; //menor posição recebe posição de i
			for(int j = i+1;j<arr.length;j++){//FOR j para percorrer todo o vetor e comparar i com todas posições até a última posição
				if(arr[j]<arr[menor]){//SE j for menor do que a posição do menor encontrado:
				  menor = j;//menor passa a ser a posição j
				}
			}
      aux = arr[menor]; //aux guarda o elemento menor
      arr[menor] = arr[i];//o elemento menor, vai para a posição i
	  arr[i] = aux;// e a antiga posição que foi trocada, vai para a aux
		}
  }

    /**
     * Busca Binária é um algoritmo para encontrar um item em uma lista ordenada.
     * @param arr,num representam um vetor de inteiros e um número que tem como valor o tamanho do vetor
     */
public Integer buscaBinaria(Integer arr[], Integer numero) {
    try {
        // Tentativa de criar uma instância de ValorInvalidoException
        // e passar o array 'arr' como argumento
        new ValorInvalidoException(arr);
    } catch (ValorInvalidoException e) {
        //Se a exceção for lançada, imprime a mensagem de erro
        System.out.println(e.getMessage());
    }
    // Verifica se o número a ser buscado não é nulo
    if (numero != null) {
        // Inicializa os índices esquerda e direita para realizar a busca
        int esquerda = 0;
        int direita = arr.length - 1;
        int meio;

        // Enquanto o índice esquerda for menor ou igual ao índice direita
        while (esquerda <= direita) {
            // Calcula o índice do meio do subarray atual
            meio = (esquerda + direita) / 2;
            // Compara o elemento no meio do subarray com o número desejado
            if (arr[meio].equals(numero)) {
                // Se o elemento for igual ao número, retorna o índice onde foi encontrado
                return meio;
            }

            // Se o elemento no meio do subarray for menor que o número,
            // atualiza o índice esquerda para procurar à direita do meio
            if (arr[meio] < numero) {
                esquerda = meio + 1;
            }
            // Se o elemento no meio do subarray for maior que o número,
            // atualiza o índice direita para procurar à esquerda do meio
            if (arr[meio] > numero) {
                direita = meio - 1;
            }
        }
    }
    // Se o número não for encontrado, retorna -1
    return -1;
}

}
