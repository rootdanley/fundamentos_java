public class BuscaBinaria2 {
  public static void main(String[] args){
    int[] arr = new int[] {0, 2,4,6,8,10,12,14,16};

    int inicio = 0;
    int fim = arr.length - 1;
    int meio = 0; 
    int alvo = 2;
    boolean achou = false;

    while(inicio <= fim){
      meio = (inicio + fim) / 2;

      if(arr[meio] == alvo){
        achou =  true;
        break;

      }
      else if(arr[meio] > alvo){
        fim = meio - 1;
      }
      else {
        inicio = meio + 1;
      }
    }


    if(achou){
      System.out.println("achei no indicie: " + meio);
    }else {
      System.out.println("deu ruim");
    }







    }
}
