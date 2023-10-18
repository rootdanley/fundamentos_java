public class BubbleSorting {
  public static void main(String[] args){

/*
 * Diferente do Selection sort, o bubble vai verificando e trocando ao mesmo tempo.
 */


    int arr[] = new int[] {13,1,4,5,-3,13,10,11,23300};

    for(int i=0; i<arr.length; i++){
      for(int j= i + 1;j<arr.length; j++){
        if(arr[i] > arr[j]){ // ele troca a cada iteracao
          int aux = arr[i];
          arr[i] = arr[j];
          arr[j] = aux;
        }
      }
    }

    for(int elemento : arr){
      System.out.print(elemento + " ");
    }
  }
  
}

