package Revisao.Vetores.entities;

import java.util.Arrays;

public class Alunos {
  private String nome;
  private Double[] notas = new Double[2]; // Correção aqui

  public Alunos(String nome2, Double[] notas2) {
    this.nome = nome2;
    this.notas = notas2;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double[] getNotas() {
    return notas;
  }


  public double mediaNotas(){
    double somar = 0.0;
    for(int i = 0; i < notas.length; i++){
      somar += notas[i];
    }
    return somar / notas.length;
  }

}
