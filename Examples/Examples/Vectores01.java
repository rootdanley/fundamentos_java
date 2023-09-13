package Examples;

public class Vectores01 {
  public static void main(String[] args) {
    // 1. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
    // tipo e tamanho, sendo que cada elemento do vetor B deverá ser
    // o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[i].

    int vect[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 14, 15 };
    int vect1[] = new int[15];

    for (int i = 0; i < vect.length; i++) {
      vect1[i] = vect[i] * vect[i];
    }

    for (int indice : vect1) {
      System.out.println(indice);
    }
  }
}
