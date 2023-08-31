package Examples.lacoFor;

import java.util.List;

public class forNoJava {
  public static void main(String[] args) {

    int[] arr = { 24, 42, 0 };
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " "); // prints: 24 42 0
    }

    int[] arr2 = { 24, 42, 0 };
    // forma compacta (for each)
    for (int a : arr2) {
      System.out.print(a + " "); // prints: 24 42 0
    }

    // collections
    List<String> list = List.of("24", "42", "0");
    for (String s : list) {
      System.out.print(s + " "); // prints: 24 42 0
    }

  }
}
