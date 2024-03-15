package pratica04.models;


import pratica04.enums.Categoria;

public class Produto {
   private String nome;
   private Double preco;
   
   private Categoria categoria;
   
   public Produto(String nome, Double preco, Categoria categoria) {
      this.nome = nome;
      this.preco = preco;
      this.categoria = categoria;
   }
   
   public String getNome() {
      return nome;
   }
   
   public Double getPreco() {
      return preco;
   }
   
   public Categoria getCategoria() {
      return categoria;
   }
}
