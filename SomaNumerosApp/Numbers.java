package SomaNumerosApp;

public class Numbers {
  private Integer number;

  //construtaor com argumento
  public Numbers(Integer number) {
    this.number = number;
  }

  // construtor sem argumento
  public Numbers(){}

  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }


  @Override
  public String toString() {
    return "Numbers{" +
        "number=" + number +
        '}';
  }
}
