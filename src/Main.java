import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {

      try {
          FileReader arquivoMinic = new FileReader("src/MiniC.txt");
          ClasseJFlex analisador = new ClasseJFlex(arquivoMinic);

          Token token = analisador.yylex();
          while (token != null){
              System.out.println(token);
              token = analisador.yylex();
          }
      }catch (IOException e){
          e.printStackTrace();
      }
  }
}
