package BibliotecaAplication.entities;

public class Livro {
  private String titulo;
  private String autor;
  private Integer anoPublicacao;
  private Integer numCopiasDisponiveis;

  public Livro(String titulo, String autor, Integer anoPublicacao, Integer numCopiasDisponiveis) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.numCopiasDisponiveis = numCopiasDisponiveis;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public Integer getAnoPublicacao() {
    return anoPublicacao;
  }

  public void setAnoPublicacao(Integer anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
  }

  public Integer getNumCopiasDisponiveis() {
    return numCopiasDisponiveis;
  }



  public void setNumCopiasDisponiveis(Integer numCopiasDisponiveis) {
    this.numCopiasDisponiveis = numCopiasDisponiveis;
  }



  @Override
  public String toString() {
    return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoPublicacao=" + anoPublicacao +
        ", numCopiasDisponiveis=" + numCopiasDisponiveis +
        '}';
  }
}
