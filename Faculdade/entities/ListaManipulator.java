package Faculdade.entities;

public class ListaManipulator {

    private Integer[] arr;
    private Integer num;


    // construtores 
    public ListaManipulator(Integer[] arr) {
        this.arr = arr;
    }

    public ListaManipulator(Integer[] arr, Integer num) {
      this.arr = arr;
      this.num = num;
    }

    public ListaManipulator(){ }
    
    
    //getters e setters

    public Integer[] getArr() {
        return arr;
    }

    public void setArr(Integer[] arr) {
        this.arr = arr;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    //métodos

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


    public void insertionSort() {
      int maior = -9999;
      int imaior = 0;
      
      for(int i=0;i<=arr.length-1;i++){
         if(arr[i] > maior){
            imaior = i;
            maior= arr[i];
         }
      }
      int aux = arr[arr.length-1];
      arr[arr.length-1] = maior;
      arr[imaior] = aux;
  }
  

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


  public Integer buscaBinaria(Integer arr[], Integer numero ){
    int esquerda = 0;
    int direita = arr.length - 1;
    int meio;
    while(esquerda <= direita){
      meio = (esquerda + direita) / 2;
      if(arr[meio] == numero){
        return meio;
      }
      if(arr[meio] < numero){
        esquerda = meio + 1;
      }
      if(arr[meio] > numero){
        direita = meio - 1;
      }
    }
    return -1;
  }
}
