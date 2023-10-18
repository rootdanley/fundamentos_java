public class SelectionSorting {
  
  public static void main(String[] args){
    int[] lista = new int[] {7,5,1,8,3,-2};

 // complexidade quadratica
   
    

    for(int i = 0; i < lista.length; i++){
      int menorNumero = i; // Guardamos o indice do primeiro loop
      for(int j = i + 1; j < lista.length; j++){ 
        if(lista[j] < lista[menorNumero]){ // verifica se o proximo indice é menor que o anterior, assim ele guarda o indice do menor numero
          menorNumero = j; // guarda o indice do menor numero
        }
        
      }
      
      int aux = lista[menorNumero];
      lista[menorNumero] = lista[i];
      lista[i] = aux;
    }


     for(int elemento : lista){
        System.out.print(elemento + " ");
      }

      
  }
}


