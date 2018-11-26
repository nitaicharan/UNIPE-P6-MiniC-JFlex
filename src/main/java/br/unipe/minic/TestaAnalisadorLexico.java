package br.unipe.minic;
//package br.com.analisorlexico;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//
//import java_cup.runtime.Symbol;
//
//public class TestaAnalisadorLexico {
//
//  public static void main(String[] args)  {
//		
//	BufferedReader bufferedReader;
//	AnalisadorLexico analisadorLexico;
//
//	System.out.println( "Analise Lexica: \n" );
//	
//    try {
//		
//      bufferedReader = new BufferedReader( new InputStreamReader( new FileInputStream( "programas/Programa_1_MiniC.txt" ) ) );
//
//      analisadorLexico = new AnalisadorLexico( bufferedReader );
//      
//      while ( !analisadorLexico.zzAtEOF ) {
//    		 
//        Symbol symbol = analisadorLexico.next_token();
//   	   
//        if( symbol != null ) {
//   	            	
//   	      System.out.println( symbol.value );
//   	     
//        }
//   	   
//      }
//		
//    }
//	
//    catch (Exception e) {
//		
//      System.err.println( "Exce��o: " + e.getMessage() );
//    	
//    }
//	
//  }
//
//}
