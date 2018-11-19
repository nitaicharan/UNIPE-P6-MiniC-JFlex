package br.com.minic;

import java.io.File;
import java.io.FileReader;

import br.com.minic.analisadorlexico.AnalisadorLexico;
import br.com.minic.analisadorsintatico.parser;
import java_cup.runtime.Symbol;

public class CompiladorMiniC {
	public static void main(String[] args) throws Exception {

		File arquivoMinic = new File("programas/ProgramaTeste2.txt");
		AnalisadorLexico analisador = new AnalisadorLexico(new FileReader(arquivoMinic));

		System.out.println("Executando Análise\n");
		parser parser = new parser(analisador);

		try {
		Symbol symbol = parser.parse();
		System.out.println("\n Quantidade de Erros: " + symbol);
		} catch(Exception e) {
			
			System.out.println();
		}
	}
}
