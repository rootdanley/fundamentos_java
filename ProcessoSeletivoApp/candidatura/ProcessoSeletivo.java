package ProcessoSeletivoApp.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String[] candidatos = {"MARCOS", "FELIPE", "JOAQUIN", "JONAS", "DANLEY"};
    for(String candidato: candidatos) {
      entrandoEmContato(candidato);
    }

  }

  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do{
      atendeu = atender();
      continuarTentando = !atendeu;
      if(continuarTentando){
        tentativasRealizadas++;
      }
    }while(continuarTentando && tentativasRealizadas < 3);

    if(atendeu){
      System.out.println("Contato com " + candidato + " na " + tentativasRealizadas);
    }else{
      System.out.println("nao conseguimos contato com " + candidato + " Numero maximo de tentativas atingidas"); 
    }
  }

  static boolean atender(){
    return new Random().nextInt(3)==1;
  }

  static void imprimirSelecionados(){
    String[] candidatos = {"MARCOS", "FELIPE", "JOAQUIN", "JONAS", "DANLEY"};
    System.out.println("Imprimidno a lista de candidatos informando o indice do elemento");

    for(int indice = 0; indice < candidatos.length; indice++){
      System.out.println("O candidato de numero " + (indice+1) + " e " + candidatos[indice]);
    }

    for(String candidato: candidatos){
      System.out.println("o candidato selecionado foi " + candidato);
    }
  }

  static void selecaoCandidatos(){
    String[] candidatos ={"MARCOS", "FELIPE", "JOAQUIN", "JONAS", "DANLEY"};

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " Solicitou este valor de salario: R$" + salarioPretendido);
      if(salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " Foi selecionado");
        candidatosSelecionados++;
      }

      candidatoAtual++;
    }
  }

  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido){
      System.out.println("Ligar para o candidato");
    }else if(salarioBase == salarioPretendido){
      System.out.println("Ligar para candidato com contra proposta");
    }else {
      System.out.println("Aguardando resultados");
    }

  }
}
