package BibliotecaApp;

public class Programa {
  public static void main(String[] args){
    CatalogoLivros livros = new CatalogoLivros();

    // Adicionando "Java: Como Programar" à lista de livros
    livros.adicionarLivro("Java: Como Programar", "Paul Deitel e Harvey Deitel", 2009);

    // Adicionando "Effective Java" à lista de livros
    livros.adicionarLivro("Effective Java", "Joshua Bloch", 2019);

    // Adicionando "Head First Java" à lista de livros
    livros.adicionarLivro("Head First Java", "Kathy Sierra e Bert Bates", 2022);

    // Adicionando "Java Concurrency in Practice" à lista de livros
    livros.adicionarLivro("Java Concurrency in Practice", "Brian Goetz e outros", 2000);

    // Adicionando "Clean Code: A Handbook of Agile Software Craftsmanship" à lista de livros
    livros.adicionarLivro("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 2021);

    // Adicionando "Java: The Complete Reference" à lista de livros
    livros.adicionarLivro("Java: The Complete Reference", "Herbert Schildt", 2000);

    // Adicionando "Java Performance: The Definitive Guide" à lista de livros
    livros.adicionarLivro("Java Performance: The Definitive Guide", "Scott Oaks", 2000);


    System.out.println(livros.pesquisarPorAutor("Joshua Bloch"));
    System.out.println(livros.pesquisarPorAno(2020, 2024));

    System.out.println(livros.pesquisarPorTitulo("Head First Java"));
  }
}
