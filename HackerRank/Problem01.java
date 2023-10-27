import java.util.Scanner;

public class Problem01 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("digite n:");  
    int N = sc.nextInt();

    if (N % 2 == 0 && N >= 2 && N <= 5) {
      System.out.println("Not Weird");
    }
    else if (N % 2 == 0 && N >= 6 && N <= 20){
      System.out.println("Weird");
    }
    else if (N % 2 == 0 && N > 20){
      System.out.println("Not Weird");
    }
    else {
      System.out.println("Weird");
    }
    

  }
}
