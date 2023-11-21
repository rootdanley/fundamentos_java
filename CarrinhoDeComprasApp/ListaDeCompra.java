package CarrinhoDeComprasApp;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompra {
  private List<CarrinhoDeCompra> listaDeCompra;


  public ListaDeCompra() {
    this.listaDeCompra = new ArrayList<CarrinhoDeCompra>();
  }

  public void adicionarItem(String nome, Double preco, Integer quantidade){
    this.listaDeCompra.add(new CarrinhoDeCompra(nome, preco, quantidade));
  }

  public void removerItem(String nome){
    List<CarrinhoDeCompra> removerItemList = new ArrayList<CarrinhoDeCompra>();

    for(CarrinhoDeCompra c : this.listaDeCompra){
      if(c.getNome().equalsIgnoreCase(nome)){
        removerItemList.add(c);
      }
    }

    this.listaDeCompra.removeAll(removerItemList);
  }


  public Double CalcularValorTotal(){
    double valorTotal = 0.0;

    for(CarrinhoDeCompra carrinho : this.listaDeCompra) {
      valorTotal += carrinho.getPreco() * carrinho.getQuantidade();
    }
    return valorTotal;
  }


  public void exibirCarrinho(){
    System.out.println(listaDeCompra);
  }

}
