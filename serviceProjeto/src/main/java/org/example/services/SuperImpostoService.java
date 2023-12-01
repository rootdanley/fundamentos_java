package org.example.services;

public class SuperImpostoService extends TaxService{

  @Override
  public double tax(double amount) {
    return amount * 0.7;
  }
}
