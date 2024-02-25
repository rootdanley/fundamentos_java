package models;

import java.util.Scanner;

public class Menu {
    
    private Scanner scanner;
    private Biblioteca biblioteca;
    private Livro livro;
    
    public Menu() {
        this.scanner = new Scanner(System.in);
        this.biblioteca = new Biblioteca();
        
    }
    
    
    public void exibirMenu() {
       while (true) {
          System.out.println("\n--- Sistema de Gerenciamento de Biblioteca ---");
          System.out.println("1. Adicionar Livro");
          System.out.println("2. Remover Livro por ISBN");
          System.out.println("3. Buscar Livro por Título");
          System.out.println("4. Buscar Livro por Autor");
          System.out.println("5. Listar Todos os Livros");
          System.out.println("6. Sair");
          System.out.print("Escolha uma opção: ");
          int opcao = scanner.nextInt();
          scanner.nextLine();
          
          switch (opcao) {
             case 1:
                adicionarLivro();
                break;
             case 2:
                removerLivroPorISBN();
                break;
             case 3:
                buscarLivroPorTitulo();
                break;
             case 4:
                buscarLivroPorAutor();
                break;
             case 5:
                listarLivros();
                break;
             case 6:
                System.out.println("Saindo do sistema...");
                return;
             default:
                System.out.println("Opção inválida.");
          }
       }
       
    }
   
   private void adicionarLivro() {
      System.out.println("Qual tipo de livro irá adicionar? Digital ou Fisico");
      String tipoDeLivro = scanner.nextLine().trim();
      
      Livro livro = null;
      switch (tipoDeLivro.toLowerCase()) {
         case "digital":
            livro = criarLivroDigital();
            break;
         case "fisico":
            livro = criarLivroFisico();
            break;
         default:
            System.out.println("Tipo de livro inválido. Por favor, escolha 'Digital' ou 'Fisico'.");
            return;
      }
      
      if (livro != null) {
         biblioteca.adicionarLivro(livro);
         System.out.println("Livro adicionado com sucesso!");
      }
   }
   
   private LivroDigital criarLivroDigital() {
      System.out.print("Digite o formato (.pdf, .epub, .txt, etc.): ");
      String formato = scanner.nextLine();
      
      System.out.print("Digite o tamanho do livro em MB: ");
      double tamanho = Double.parseDouble(scanner.nextLine());
      
      System.out.print("Digite o título do livro: ");
      String titulo = scanner.nextLine();
      
      System.out.print("Digite o autor do livro: ");
      String autor = scanner.nextLine();
      
      System.out.print("Digite o ISBN do livro: ");
      String isbn = scanner.nextLine();
      
      return new LivroDigital(titulo,autor,isbn,formato,tamanho);
   }
   
   private LivroFisico criarLivroFisico() {
      System.out.print("Digite o número de páginas: ");
      int paginas = Integer.parseInt(scanner.nextLine());
      
      System.out.print("Digite o título do livro: ");
      String titulo = scanner.nextLine();
      
      System.out.print("Digite o autor do livro: ");
      String autor = scanner.nextLine();
      
      System.out.print("Digite o ISBN do livro: ");
      String isbn = scanner.nextLine();
      
      return new LivroFisico(titulo,autor,isbn,paginas);
   }
   
   private void removerLivroPorISBN() {
      System.out.print("Digite o ISBN do Livro para remover:");
      String IsbnLivro = scanner.nextLine();
      
      biblioteca.removerLivroPorISBN(IsbnLivro);
   }
   
   private void buscarLivroPorTitulo() { }
   
   private void buscarLivroPorAutor() {
   
   }
   
   private void listarLivros() {
      biblioteca.listarLivros();
   }
}
