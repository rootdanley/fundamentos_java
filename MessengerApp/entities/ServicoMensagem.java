package MessengerApp.entities;

public class ServicoMensagem {
  public void enviarMensagem(){
    validarConectadoInternet();
    System.out.println("Enviando Mensagem");
    salvarHistoricoMensagem();
    receberMensagem();
  }

  public void receberMensagem(){
    System.out.println("Recebendo mensagem");
  }

  private void validarConectadoInternet(){
    System.out.println("Estado conectado Internet");
  }

  private void salvarHistoricoMensagem(){
    System.out.println("Mensagem salva no historico");
  }


}
