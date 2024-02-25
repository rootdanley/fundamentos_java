import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
   
   public static void main(String[] args) {
      
      List<String> linhas = new ArrayList<>();
      String path = "/home/superbit/Documentos/fundamentos_java/manipulacao-de-arquivo/src/labirinto.txt";
      
      try (BufferedReader br = new BufferedReader(new FileReader(path))) {
         String linha;
         while((linha = br.readLine()) != null) {
            linhas.add(linha);
            System.out.println(linha);
         }
         
         System.out.println("====================================================");
         
         int larguraEsperada = Integer.parseInt(linhas.get(0));
         int alturaEsperada = Integer.parseInt(linhas.get(1));
         boolean erroDetectado = false;
         
         if (linhas.size() - 2 != alturaEsperada) {
            System.out.println("O número de linhas do labirinto é diferente do esperado.");
            erroDetectado = true;
         }
         
         for(int i = 2; i < linhas.size(); i++) {
            String linhaAtual = linhas.get(i);
            
            if(linhaAtual.length() != larguraEsperada) {
               System.out.println("Número de caracteres é maior ou menor do que o esperado na linha " + (i - 1));
               erroDetectado = true;
            }
            
            for (char c : linhaAtual.toCharArray()) {
               if (c != '.' && c != '#') {
                  System.out.println("Contém caracteres desconhecidos na linha " + (i - 1));
                  erroDetectado = true;
                  break;
               }
            }
         }
         
         if (!erroDetectado) {
            System.out.println("O arquivo do labirinto está corretamente formatado.");
         }
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
