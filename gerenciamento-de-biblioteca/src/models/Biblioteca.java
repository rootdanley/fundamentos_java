package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {

    private Map<String, Livro> livrosMap;

    public Biblioteca () {
        this.livrosMap = new HashMap<>();
    }


    public boolean adicionarLivro(Livro livro) {
        if (!livrosMap.containsKey(livro.getIsbn())) {
            livrosMap.put(livro.getIsbn(), livro);
            return true;
        } else {
            return false;
        }
    }

    public boolean removerLivroPorISBN(String isbn) {
        if (livrosMap.containsKey(isbn)) {
            livrosMap.remove(isbn);
            return true;
        } else {
            return false;
        }
    }

    public List<Livro> buscarLivrosPorTitulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for(Livro livro : livrosMap.values()) {
            if (livro.getNome().equalsIgnoreCase(titulo)) {
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados.isEmpty() ? null : livrosEncontrados;
    }

    public List<Livro> buscarLivroPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro livro : livrosMap.values()) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados.isEmpty() ? null : livrosEncontrados;
    }


    public Livro buscarLivroPorISBN(String isbn) {
        return livrosMap.get(isbn);
    }

    public void listarLivros() {
        livrosMap.values().forEach(System.out::println);
    }


}
