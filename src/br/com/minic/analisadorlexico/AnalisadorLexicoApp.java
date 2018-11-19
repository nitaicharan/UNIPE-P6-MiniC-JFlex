
package br.com.minic.analisadorlexico;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java_cup.runtime.Symbol;

/**
 * 
 * @author Hilario Tomaz Alves de Oliveira
 *
 */

public class AnalisadorLexicoApp {

  public static void main(String[] args) {

	FileReader arquivoTeste = null;
	
	try {
	
	  arquivoTeste = new FileReader( "programas/ProgramaTeste2.txt" );
	
	}
	
	catch (FileNotFoundException e) {
	
	  e.printStackTrace();
	
	  return;
	  
	}
	
    AnalisadorLexico analisadorLexico = new AnalisadorLexico( arquivoTeste );
    
    System.out.println( "\n   ------- Tokens Gerados ------- \n" );
    
    try {
		
      Symbol token = analisadorLexico.next_token();
	
      int totalOfTokens = 0;
      
      while( token.sym != 0 ) {
    	  
        System.out.println( "<" + token.sym + ", '" + token.value + "'>" );
        
        token = analisadorLexico.next_token();
        		
        totalOfTokens++;
        
      }
      
      System.out.println( "\n\n  Total de Tokens: " + totalOfTokens );
      
    }
    
    catch (IOException e) {
	
      e.printStackTrace();
	
    }  
    
  }
  
}
