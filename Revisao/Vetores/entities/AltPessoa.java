package Revisao.Vetores.entities;

public class AltPessoa {
  private Double altura;
  private char sexo;

  public AltPessoa(double altura2, char genero) {
    this.altura = altura2;
    this.sexo = genero;
  }

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public char getSexo() {
    return sexo;
  }

  public char setSexo(char sexo) {
    return this.sexo = sexo;
  }
  

  @Override
  public String toString() {
    return "AltPessoa [altura=" + altura + ", sexo=" + sexo + "]";
  }

}
