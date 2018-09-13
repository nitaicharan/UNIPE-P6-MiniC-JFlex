
//package br.com.analisorlexico;

public class TipoToken {

  // Atributos
	
  public static final int PR = 1;
  public static final int ID = 2;
  public static final int LI = 3;
  public static final int LPF = 4;
  public static final int LC = 5;
  public static final int LS = 6;
  public static final int OA = 7;
  public static final int OR = 8;
  public static final int OL = 9;
  public static final int OATR = 10;
  public static final int SP = 11;
  
  
  // Métodos
  
  public static String retornarTipo(int tipo) {
	  
    switch( tipo ) {
    
      case TipoToken.PR: return "PALAVRA RESERVADA";
      case TipoToken.ID: return "Identificador";
      
      case TipoToken.LI: return "LITERAL Inteiro";
      case TipoToken.LPF: return "LITERAL Ponto Flutuante";
      
      case TipoToken.LC: return "LITERAL Char";
      case TipoToken.LS: return "LITERAL String";
      
      case TipoToken.OA: return "Operador Aritmético";
      case TipoToken.OR: return "Operador Relacional";
      case TipoToken.OL: return "Operador Lógico";
      case TipoToken.OATR: return "Operador Atribuição";
      
      case TipoToken.SP: return "Símbolo Pontuação";
      
      default: return "TIPO INVÁLIDO";
      
    }
    
  }
  
}
