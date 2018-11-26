package br.unipe.minic.elementos;

public class LiteralInteiro implements IExpressao {

	private int valor;

	public LiteralInteiro(int valor) {

	  this.setValor( valor );
	  
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
  @Override

  public String toString() {

    return String.valueOf(this.getValor());

  }

@Override
public void setEntreParenteses(boolean isEntreParenteses) {
	// TODO Auto-generated method stub
	
}

}
