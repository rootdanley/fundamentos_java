package Pratica.ProductApp.entities;

// atributos
public class Product {
  public String name;
  public double price;
  public int quantity;

  // metodos/funcoes
  public double totalValueInStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity; // this = referencia para o atributo da classe
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }
}
