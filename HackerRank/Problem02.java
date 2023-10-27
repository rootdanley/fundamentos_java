import java.util.Scanner;

public class Problem02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i = 0;
    String s = "";
    Double d = 0.0;

    System.out.print("Digite int:");
    i = sc.nextInt();

    sc.nextInt();

    System.out.print("Digite String:");
    s = sc.nextLine();

    System.out.print("Digite Double:");
    d = sc.nextDouble();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
}
