package pratica02;

public enum NivelDeAcesso {
   ADMIN(1),
   USUARIO(2),
   VISITANTE(3);
   
   private int grauDeAcesso;
   
   // Construtor privado que associa um grau de acesso a cada constante da enumeração.
   NivelDeAcesso(int grauDeAcesso) {
      this.grauDeAcesso = grauDeAcesso;
   }
   
   // Getter para o grau de acesso.
   public int getGrauDeAcesso() {
      return grauDeAcesso;
   }
}
