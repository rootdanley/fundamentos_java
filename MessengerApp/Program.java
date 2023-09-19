package MessengerApp;

import MessengerApp.Services.FacebookMessenger;

public class Program {
  public static void main(String[] args) {
    FacebookMessenger fc = new FacebookMessenger();
    fc.enviarMensagem();
  }
}
