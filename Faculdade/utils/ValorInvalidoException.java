package Faculdade.utils;

public class ValorInvalidoException extends RuntimeException {
  
  public ValorInvalidoException(Integer[] arr) {
    super("O array não está ordenado.");
    if (!isOrdenado(arr)) {
        throw this;
    }
    
}

private boolean isOrdenado(Integer arr[]) {
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < arr[i - 1]) {
            return false;
        }
    }
    return true;
  }
}
