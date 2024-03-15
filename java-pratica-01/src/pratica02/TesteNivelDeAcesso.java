package pratica02;

public class TesteNivelDeAcesso {
   public static void main(String[] args) {
      // verificação e impressão do grau de acesso para cada nível.
      for (NivelDeAcesso nivel : NivelDeAcesso.values()) {
         System.out.println("Nível de Acesso: " + nivel + ", Grau de Acesso: " + nivel.getGrauDeAcesso());
      }
      
//      determinar se um usuário tem acesso a uma funcionalidade específica.
      NivelDeAcesso nivelDoUsuario = NivelDeAcesso.USUARIO;
      
      if (nivelDoUsuario.getGrauDeAcesso() <= NivelDeAcesso.ADMIN.getGrauDeAcesso()) {
         System.out.println("O usuário tem acesso a funcionalidades de administração.");
      } else {
         System.out.println("O usuário NÃO tem acesso a funcionalidades de administração.");
      }
   }
}
