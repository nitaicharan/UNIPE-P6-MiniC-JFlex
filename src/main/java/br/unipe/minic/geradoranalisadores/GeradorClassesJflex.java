
package br.com.minic.geradoranalisadores;

import java.io.File;

/**
 * 
 * @author Hilario Tomaz Alves de Oliveira
 *
 */

public class GeradorClassesJflex {

  public static void main(String[] args) {
	
    jflex.Main.generate( new File( "especificacoes/MiniC.lex" ) );

  }
}
