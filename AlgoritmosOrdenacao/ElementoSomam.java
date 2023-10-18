public class ElementoSomam {
  public static void main(String[] args) {
    int[] arr = new int[] {4, 7, 4, 5, 11, 5 };
    int alvo = 9;

    /*
     *  Resumo: o primeiro loop pega o primeiro elemento, o segundo loop vai iterar no array para achar os numero que de acordo com o elemento no indice 
     * do primeiro loop seja o valor do alvo: se o valor do primeiro loop e o valor do segundo loop for a soma que da 9, sera printado o indice
     * @author Danley Alves
     */

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) { // Comece o loop interno a partir do próximo elemento
        if (arr[i] + arr[j] == alvo) {
          System.out.println(i + " " + j);
        }
      }
    }
  }
}
