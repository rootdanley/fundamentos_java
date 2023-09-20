package entities;

public class Palavras {
  private String pergunta;
  private String resposta;

  public Palavras() {

  }

  public Palavras(String pergunta, String resposta) {
    this.pergunta = pergunta;
    this.resposta = resposta;
  }

  public String getPergunta() {
    return pergunta;
  }

  public String getResposta() {
    return resposta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public void setResposta(String resposta) {
    this.resposta = resposta;
  }

  @Override
  public String toString() {
    return "Pensao{" +
        "pergutna='" + pergunta + '\'' +
        ", resposta='" + resposta + '\'' +
        '}';
  }
}
