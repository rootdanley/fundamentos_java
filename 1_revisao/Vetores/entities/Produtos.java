package Revisao.Vetores.entities;

public class Produtos {
  private String name;
  private Double price;

  public Produtos(String name, Double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Produtos{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}
