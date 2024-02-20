package models;
import java.util.Scanner;

public class Menu {
    private Estoque estoque;
    private Scanner scanner;

    public Menu() {
        this.estoque = new Estoque();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        while (true) {
            System.out.println("\nSistema de Gerenciamento de Estoque");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Remover Produto");
            System.out.println("4. Editar Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha após o número

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    estoque.listarProdutos();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    editarProduto();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void adicionarProduto() {
        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir nova linha após o número

        Produto produto = new Produto(nome, quantidade, preco);
        estoque.adicionarProduto(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private void removerProduto() {
        System.out.print("Nome do Produto para remover: ");
        String nomeProduto = scanner.nextLine();
        estoque.removerProduto(nomeProduto);
        System.out.println("Produto removido com sucesso!");
    }

    private void editarProduto() {
        System.out.print("Nome do Produto atual: ");
        String nomeOriginal = scanner.nextLine();

        System.out.print("Novo nome do Produto: ");
        String novoNome = scanner.nextLine();

        System.out.print("Nova quantidade: ");
        int novaQuantidade = scanner.nextInt();

        System.out.print("Novo preço: ");
        double novoPreco = scanner.nextDouble();
        scanner.nextLine(); // Consumir nova linha após o número

        boolean editado = estoque.editarProduto(nomeOriginal, novoNome, novaQuantidade, novoPreco);
        if (editado) {
            System.out.println("Produto editado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
