package Examples.primitive;

public class floatDouble {
  public static void main(String[] args) {
    // floating-point types
    // float = 32 bit
    // double = 64 bit

    // o java assume que todo numero com um ponto (43.4) é um double
    // se tentarmos declar como float ele da erro

    float f = 34.3; // erro cannot convert to double

    // modo certo
    float m = 34.3f;

    // ou

    float n = 33.2F;

    float x = (float) 34.2d; // usando casting para converter para float

    var xiu = 1;
  }
}
