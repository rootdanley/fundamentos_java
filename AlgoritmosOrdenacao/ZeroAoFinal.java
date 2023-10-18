package AlgoritmosOrdenacao;

public class ZeroAoFinal {
  public static void main(String[] args){
    // Aqui, você precisa reorganizar um array de forma que todos os zeros estejam no final,
    // enquanto os elementos não nulos permanecem na mesma ordem. 
    // Por exemplo, se o array for [0, 1, 0, 3, 12], a saída seria [1, 3, 12, 0, 0].

    int[] arr = new int[] {0,1,0,3,12};

    for(int i = 0; i < arr.length -1; i++){
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i] == 0 && arr[j] != 0) {
          int aux = arr[i];
          arr[i] = arr[j];
          arr[j] = aux;
        }
      }
    }

    for(int i : arr){
      System.out.println(i);
    }
    
  }
}
