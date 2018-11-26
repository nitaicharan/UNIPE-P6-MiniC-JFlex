package br.unipe.minic;

import java.io.File;
import java.io.FileReader;

import br.unipe.minic.elementos.ProgramaMiniC;
import java_cup.runtime.Symbol;

public class CompiladorMiniC {

  public static void main(String[] args) throws Exception {
  
	File programaTeste = new File ( "programas/Programa_1_MiniC.txt" );
    
	AnalisadorLexico analisadorLexico = new AnalisadorLexico( new FileReader( programaTeste ) );
	
	parser parser = new parser( analisadorLexico );
	
	Symbol symbol = parser.parse();
	
	ProgramaMiniC programaMiniC = (ProgramaMiniC) symbol.value;
	
	System.out.println(programaMiniC );
    
  }
  
}
