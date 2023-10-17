public class BubbleSorting {
  public static void main(String[] args){
    int arr[] = new int[] {13,1,4,5,-3,13,10,11};

    for(int i=0; i<arr.length; i++){
      for(int j= i + 1;j<arr.length; j++){
        if(arr[i] > arr[j]){
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
