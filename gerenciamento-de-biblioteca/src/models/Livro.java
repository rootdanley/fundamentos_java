package models;


public class Livro {
    private String nome;
    private String autor;
    private String isbn;
    
    public Livro() { }

    public Livro(String nome, String autor, String isbn) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
