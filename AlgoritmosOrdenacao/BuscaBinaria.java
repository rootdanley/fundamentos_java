public class BuscaBinaria {
  public static void main(String[] args){
    /* **Procurar um elemento em um array ordenado e retornar seu índice ou -1 se não encontrado**
    Nesta questão, você recebe um array ordenado e um valor-alvo. Sua tarefa é encontrar o valor-alvo no array e retornar seu índice.
    Se o valor-alvo não estiver presente, retorne -1.
    Por exemplo, em um array ordenado [-1, 0, 3, 5, 9, 12], se o alvo for 9, a saída seria 4, porque 9 está no índice 4.  */



    /*
     * Copyright (c) 2023
     * All rights reserved
     * @author Danley Alves
     * 
     */


    /*
     * o  seguinte codigo é a implementacao de um busca binaria "dividir para conquistar"
     * 
     *  devemos criar variaveis  de inicio, fim e meio para realizar divisao do array no meio
     *  inicio = 0 : pegando o inicio do array(indice)
     *  fim = arr.length - 1: pegamos o ultimo indice do array (6 - 1 = 5) pois o array começa em 0 e vai ate 5
     * 
     * 
     * meio = inicio + fim / 2 : pegando o inicio do array  e o fim do mesmo, achamos o meio: aí que é o pulo do gato, pq iremos comparar se o elemento que buscamos
     * é maior ou menor que o meio, assim iremos para o lado esquerda(menor) ou direito(maior) para buscar, dessa forma iremos dividir o array.
     * 
     * 
     */

    int[] arrOrdenado = new int[] {-1, 0 , 3, 5 , 9 ,12};
    int alvo = 5;
    int inicio = 0;
    int fim = arrOrdenado.length - 1;
    int meio = 0;

    boolean flag = false;

    while(inicio <= fim) {
      meio = ( inicio + fim ) / 2;
      // achando o meio para dividir

      if(arrOrdenado[meio] == alvo) {
        // verificando se o meio é igual ao elemento alvo buscado
        flag = true;
        break;
      }
      else if(arrOrdenado[meio] < alvo) {
        // se o meio for menor que o alvo, sabemos que o alvo esta localizado no lado direito, pq ele é maior, desta forma o inicio ira para o meio
        inicio = meio + 1;
      }
      else {
        // senao o alvo esta localizado no lado esquerdo pq ele sera menor que o meio, desta forma o fim ira para o meio
        fim = meio - 1;
      }

    }
    if(flag) {
      System.out.println("achou no indice: " + meio);
    }
    else {
      System.out.println("nao achou");
    }
  }
}
