
package br.unipe.minic.elementos;

import java.util.ArrayList;

public class FuncaoMain {

	// Atributos

	private TipoMain tipoMain;
	private TipoRetorno retorno;
	private ArrayList<IComando> ComandosOpt;
	
	
	// Construtor

	public FuncaoMain(TipoMain tipoMain, ArrayList<IComando> ComandosOpt ,TipoRetorno retorno) {

	  this.setTipoMain( tipoMain );
	  this.setRetorno( retorno );
	  this.setComandosOpt(ComandosOpt);
	  
	}
	
	// M�todos


	public ArrayList<IComando> getComandosOpt() {
        return ComandosOpt;
    }

    public void setComandosOpt(ArrayList<IComando> ComandosOpt) {
        this.ComandosOpt = ComandosOpt;
    }
   
  public TipoMain getTipoMain() {
	
    return tipoMain;
	
  }

  public void setTipoMain(TipoMain tipoMain) {
	
    this.tipoMain = tipoMain;
	
  }

  public TipoRetorno getRetorno() {
	
	return retorno;
	
  }

  public void setRetorno(TipoRetorno retorno) {
	
    this.retorno = retorno;

  }

  @Override
	
  public String toString() {
	
	StringBuilder toString = new StringBuilder();
	
	toString.append( this.getTipoMain().toString() );
	toString.append( " main () {\n\n" );	
	if( this.ComandosOpt != null ) {
        for(IComando ComandoOptions: this.ComandosOpt) {

        toString.append( ComandoOptions.toString() );
        toString.append( "\n" );

      }
    }
	if( this.getRetorno() != null ) {
		
	  toString.append( "  return " );
	  toString.append( this.getRetorno().toString() );
	  toString.append( ";" );
	  
	}
	
	toString.append( "\n\n}" );
	
    return toString.toString();
	  
  }
	
}
