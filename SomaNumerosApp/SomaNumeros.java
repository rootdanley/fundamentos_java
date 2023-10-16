package SomaNumerosApp;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  private List<Numbers> number;
  
  public SomaNumeros() {
    number = new ArrayList<Numbers>();
  }

  public void addNumbers(Integer number){
    this.number.add(new Numbers(number));
  }

  public Integer calcularSoma(){
    Integer soma = 0;
    for(Numbers num: number) {
      soma += num.getNumber();
    }
    return soma;
  }


  public Integer encontrarMaiorValor(){
    Integer maior = 0;
    for(Numbers num: number) {
      if(num.getNumber() > maior) {
        maior = num.getNumber();
      }

     
    }
     return maior;
  }

  public void exibirNumeros(){
    System.out.println(number);
  }

}
