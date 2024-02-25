package models;

public class LivroDigital extends Livro{
    private String formato;
    private double tamanhoArquivo; // Em megabytes


    public LivroDigital(String titulo, String autor, String isbn, String formato, double tamanhoArquivo) {
        super(titulo, autor, isbn);
        this.formato = formato;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LivroDigital{");
        sb.append("formato='").append(formato).append('\'');
        sb.append(", tamanhoArquivo=").append(tamanhoArquivo);
        sb.append('}');
        return sb.toString();
    }
}
