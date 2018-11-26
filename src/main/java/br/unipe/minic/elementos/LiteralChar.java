package br.unipe.minic.elementos;

public class LiteralChar implements IExpressao {

  // Atributos
	
  private String valor;

  
  // Construtor
  
  public LiteralChar(String valor) {
 
    this.setValor( valor );
	
  }

  
  // M�todos
  
  public String getValor() {
	
    return valor;

  }

  public void setValor(String valor) {
	
	this.valor = valor;
	
  }
	
  @Override

  public String toString() {

    return String.valueOf( this.getValor() );

  }


@Override
public void setEntreParenteses(boolean isEntreParenteses) {
	// TODO Auto-generated method stub
	
}

}
