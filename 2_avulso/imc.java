public class imc {
  private Double peso;
  private Double altura;


  public imc(double peso, double altura){
    this.peso = peso;
    this.altura = altura;
  }

  public imc(){

  }

  public Double getPeso(){
    return this.peso;
  }

  public void setPeso(double peso){
    this.peso = peso;
  }

  public double getAltura(){
    return this.altura;
  }

  public void setAltura(double altura){
    this.altura = altura;
  }


  public Double calcularImc(){
    return this.peso / (this.altura * this.altura);
  }
}
