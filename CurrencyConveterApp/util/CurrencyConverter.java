package CurrencyConveterApp.util;

public class CurrencyConverter {
  private Double dollar;
  private Double amount;

  public CurrencyConverter(){
  }

  public CurrencyConverter(double dollar, Double amount){
    this.dollar = dollar;
    this.amount = amount;
  }

  public void setDollar(Double dollar) {
    this.dollar = dollar;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public double convert(double amount){
    return amount * this.dollar ;
  }
}
