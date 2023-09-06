package Pratica.ContaApp;

public class Conta {
  private Integer number;
  private String holder;
  private Double balance;

  // constructor
  public Conta(int number, String holder) {

    this.number = number;
    this.holder = holder;

  }

  public Conta(int number, String holder, double initialBalance) {
    this.number = number;
    this.holder = holder;
    deposit(initialBalance);
  }

  // method
  public int getNumber() {
    return number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    this.balance -= amount + 10.0;
  }

  public String toString() {
    return "Conta: " + number + " - Cliente:" + holder + " - R$" + balance;
  }

}
