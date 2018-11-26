package br.unipe.minic;

import java.io.File;
import java.io.IOException;

import java_cup.internal_error;

public class GeradorClassesJavaCup {

  public static void main(String[] args) throws internal_error, IOException, Exception {

    String[] argumentos = new String[] { "especificacoes/MiniC.cup" };
    
    java_cup.Main.main( argumentos );

    try {
      String[] nomes = new String[] { "parser.java", "sym.java" };

      System.out.println("\n\n------------------- Movendo arquivos gerados -------------------");

      for (String nome : nomes) {
        File gerado = new File(nome);
        File criado = new File("src/main/java/br/unipe/minic/" + nome);
        gerado.renameTo(criado);
        System.out.println("  Aquivo: " + gerado.getPath() + " -> " + criado.getPath());
      }

    } catch (Exception e) {
      System.out.println("   Erro ao mover arquivos");
    }
    
  }
  
}
