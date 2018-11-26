
package br.unipe.minic.elementos;

import java.util.ArrayList;
import java.util.List;

public class DeclaracaoFuncao {
	
  private TipoMain tipo;
  private Identificador identificador;
  private List<DeclaracaoParametro> parametros;
  private ArrayList<IComando> ComOpt;
  private IExpressao expressao;

  public DeclaracaoFuncao(TipoMain tipo, Identificador identificador, List<DeclaracaoParametro> parametros, 
		  ArrayList<IComando> ComOpt, IExpressao expressao) {

    this.setTipo( tipo );
    this.setIdentificador( identificador );
    this.setParametros( parametros );
    this.setComOpt(ComOpt);
    this.setExpressao( expressao );
    
  }  

  public TipoMain getTipo() {
	
    return tipo;

  }

  public void setTipo(TipoMain tipo) {
	
    this.tipo = tipo;

  }

  public Identificador getIdentificador() {
	
    return identificador;

  }

  public void setIdentificador(Identificador identificador) {
	
    this.identificador = identificador;

  }

  public List<DeclaracaoParametro> getParametros() {
	
    return parametros;

  }

  public void setParametros(List<DeclaracaoParametro> parametros) {
	
    this.parametros = parametros;

  }

  public IExpressao getExpressao() {
	 
    return expressao;

  }

  public void setExpressao(IExpressao expressao) {

    this.expressao = expressao;

  }
  
  public ArrayList<IComando> getComOpt() {
	return ComOpt;
  }

  public void setComOpt(ArrayList<IComando> comOpt) {
	ComOpt = comOpt;
  }

@Override

  public String toString() {
	
    StringBuilder declaracaoFuncao = new StringBuilder();
    
    declaracaoFuncao.append( this.getTipo().toString() );
    declaracaoFuncao.append( " " );
    declaracaoFuncao.append( this.getIdentificador() );
    declaracaoFuncao.append( "(" );
    
    if( this.getParametros() != null ) {
    	
      int totalParametros = this.getParametros().size();
      int totalParametrosMenos1 = this.getParametros().size() - 1;
      
      for(int i = 0; i < totalParametros; i++) {
    	  
        DeclaracaoParametro declaracaoParametro = this.getParametros().get( i );
    	  
        declaracaoFuncao.append( declaracaoParametro.toString() );
        
        if( i < totalParametrosMenos1 ) {
        	
          declaracaoFuncao.append( ", " );
        	
        }
        
      } // FOR PARAMETROS
      
    }
    
    declaracaoFuncao.append( ") {\n\n" );
    
    if( this.ComOpt != null ) {
        for(IComando ComandoOptions: this.ComOpt) {

            declaracaoFuncao.append( ComandoOptions.toString() );
            declaracaoFuncao.append( "\n" );
        
        }
    }
    
    declaracaoFuncao.append( "  return " );
    declaracaoFuncao.append( this.getExpressao().toString() );
    declaracaoFuncao.append( ";" );
    
    declaracaoFuncao.append( "\n\n}" );    
    
	return declaracaoFuncao.toString();

  }

}
