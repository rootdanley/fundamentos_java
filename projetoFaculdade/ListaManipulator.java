package projetoFaculdade;

public class ListaManipulator {

  private Integer count;
  private Integer[] list = new Integer[count];

    
  public ListaManipulator(int count, Integer[] list) {
    this.count = count;
    this.list = list;
  }

  public Integer[] getList() {
    return list;
  }

  public void setList(Integer[] list) {
    this.list = list;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public  void bubbleSort(int arr[]){//método para ordenar Bubble
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

  public  void selectionSort(int arr[]){//método para ordenar Selection
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


    
  public void insertionSort(int arr[], int tam){//método para ordenar Insertion
    int maior = -9999;
    int imaior = 0;
    
    for(int i=0;i<=tam-1;i++){
       if(arr[i] > maior){
          imaior = i;
          maior= arr[i];
       }
    }
    int aux = arr[tam-1];
    arr[tam-1] = maior;
    arr[imaior] = aux;
  }

}
