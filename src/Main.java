import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
	  int contador = 0;

      try {
          FileReader arquivoMinic = new FileReader("src/MiniC.txt");
          ClasseJFlex analisador = new ClasseJFlex(arquivoMinic);

          System.out.println("Executando a etapa de Análise Léxica\n");
          System.out.println("------- Tokens Gerados -------\n");
          Token token = analisador.yylex();
          while (token != null){
              System.out.println("\t"+token);
              token = analisador.yylex();
              contador++;
          }
          System.out.println("\nTotal de tokens: "+contador+"\n\n");
      }catch (IOException e){
          e.printStackTrace();
      }
  }
}
