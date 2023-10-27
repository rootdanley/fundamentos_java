package ParImpar;


public class Programa {
  public static void main(String[] args) {
    ListaPares paresList = new ListaPares();

    paresList.addPares(2);
    paresList.addPares(3);
    paresList.addPares(3);
    paresList.addPares(3);
    paresList.addPares(4);
    

    System.out.println(paresList.totalPares());
  }
}
