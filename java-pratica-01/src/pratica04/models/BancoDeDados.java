package pratica04.models;

import pratica04.enums.Categoria;

import java.util.HashMap;
import java.util.Map;

public class BancoDeDados {
   
   public static Map<Integer, Produto> getProdutosDisponiveis() {
      Map<Integer, Produto> produtos = new HashMap<>();
      produtos.put(1, new Produto("Caneta Azul", 1.50, Categoria.ESCOLAR));
      produtos.put(2, new Produto("Caderno 10 Matérias", 22.90, Categoria.ESCOLAR));
      produtos.put(3, new Produto("Lápis de Cor - 24 Cores", 15.00, Categoria.ESCOLAR));
      produtos.put(4, new Produto("Borracha Branca", 0.50, Categoria.ESCOLAR));
      produtos.put(5, new Produto("Marcador de Texto Amarelo", 4.00, Categoria.ESCOLAR));
      return produtos;
   }
}
