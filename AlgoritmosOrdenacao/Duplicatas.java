public class Duplicatas {
  public static void main(String[] args){
    // Essa questão envolve a tarefa de eliminar elementos duplicados de um array,
    // deixando apenas uma ocorrência de cada elemento. Por exemplo, se você tem o array [1, 2, 2, 3, 4, 4, 5], a saída desejada seria [1, 2, 3, 4, 5].

    int[] arr = new int[] {1, 2, 2, 3, 4, 4, 5, 7,7};
    int elementosDuplicados = 0;

    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i] == arr[j]){
          elementosDuplicados++;
        }
      }
    }

    int[] noArr = new int[arr.length - elementosDuplicados];


    int index = 0;

    for (int i = 0; i < arr.length; i++) {
      boolean duplicado = false;
  
      // Verifica se o elemento já foi adicionado ao novo array
      for (int j = 0; j < index; j++) {
          if (arr[i] == noArr[j]) {
              duplicado = true;
              break;
          }
      }
  
      // Se não for duplicado, adiciona ao novo array
      if (!duplicado) {
          noArr[index] = arr[i];
          index++;
      }
  }
  


    for(int i : noArr){
      System.out.println(i);
    }
  }
}
