public class SelectionSorting2 {
  public static void main(String[] args) {
    int[] arrNum = new int[] {2,5,6,1,5,44,123};


    int posicaoMenor;

    for(int i=0; i<arrNum.length; i++) {
      posicaoMenor = arrNum[i];

      for(int j= i + 1; j< arrNum.length; j++) {
        if(arrNum[j] < posicaoMenor){
          posicaoMenor = j;
        }
      }

      
    }
  }
}
