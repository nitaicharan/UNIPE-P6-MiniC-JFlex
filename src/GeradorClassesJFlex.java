import java.io.File;

public class GeradorClassesJFlex {

  public static void main(String[] args) {
    jflex.Main.generate( new File("src/ExtratorMiniC.lex") );
  }
  
}
