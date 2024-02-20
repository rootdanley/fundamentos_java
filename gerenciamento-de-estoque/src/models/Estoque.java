package models;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtoList;

    public Estoque() {
        this.produtoList = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtoList.add(produto);
    }

    public void listarProdutos() {
        if (produtoList.isEmpty()) {
            /*
            verificacao se a lista vazia, se for true exibe a msg para o usuario
             */
            System.out.println("Estoque vazio!");
        } else {
            /*
            for each mais mordeno que aceita uma expressao lambda
             */
            produtoList.forEach(System.out::println);
        }
    }

    public void removerProduto(String nomeProduto) {
        /*
            o metodo removeIf remove elementos da colecao com base em uma condicao especifica, a condicao é uma expressao lambda
         */
        produtoList.removeIf(produto -> produto.getNome().equalsIgnoreCase(nomeProduto));
    }

    public boolean editarProduto(String nomeOriginal, String novoNome, int novaQuantidade, double novoPreco) {
        for (Produto produto : produtoList) {
            if (produto.getNome().equalsIgnoreCase(nomeOriginal)) {
                produto.setNome(novoNome);
                produto.setQuantidade(novaQuantidade);
                produto.setPreco(novoPreco);
                return true; // Produto encontrado e editado
            }
        }
        return false; // Produto não encontrado
    }


}
