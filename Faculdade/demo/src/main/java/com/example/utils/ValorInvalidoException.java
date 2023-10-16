package com.example.utils;
/**
 * Classe personalizada para a exceção ValorInvalidoException.
 * Essa exceção é lançada quando um array não está ordenado.
 */
public class ValorInvalidoException extends RuntimeException {
    /**
     * Construtor da exceção, recebe um array como argumento
     * @param arr O array a ser verificado.
     * @throws ValorInvalidoException Se o array não estiver ordenado.
     */

    public ValorInvalidoException(Integer[] arr) {
            super("O array não está ordenado.");// Chama o construtor da classe mãe (RuntimeException) com uma mensagem de erro
            if (!isOrdenado(arr)){ // Verifica se o array não está ordenado
                throw this; // Se o array não estiver ordenado, lança a exceção
            }
    }
    /**
     * Método privado para verificar se um array está ordenado.
     * @param arr O array a ser verificado.
     * @return true se o array estiver ordenado, false caso contrário.
     */
    private boolean isOrdenado(Integer arr[]){// Método privado para verificar se um array está ordenado
     for (int i = 1; i < arr.length; i++){// Percorre o array a partir do segundo elemento
        if (arr[i] < arr[i - 1]) {// Se algum elemento for menor que o elemento anterior, o array não está ordenado
             return false;
        }
     }
    return true; // Se o loop não encontrou elementos desordenados, o array está ordenado
    }
}