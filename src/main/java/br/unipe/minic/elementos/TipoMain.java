
package br.unipe.minic.elementos;

public class TipoMain {

  // Atributos
	
  private String tipo;
  
  
  // Construtor
  
  public TipoMain(String tipo) {

    this.setTipo( tipo );
    
  }

  
  // M�todos
  
  public String getTipo() {
	
    return tipo;

  }

  public void setTipo(String tipo) {
	
    this.tipo = tipo;

  }
  
  @Override
	
  public String toString() {
	
    return this.getTipo();
    
  }  
  
}
