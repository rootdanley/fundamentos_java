package models;

public class LivroFisico extends Livro{
    private Integer numeroPaginas;


    public LivroFisico(String nome, String autor, String isbn, Integer numeroPaginas) {
        super(nome, autor, isbn);
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LivroFisico{");
        sb.append("numeroPaginas=").append(numeroPaginas);
        sb.append('}');
        return sb.toString();
    }
}
