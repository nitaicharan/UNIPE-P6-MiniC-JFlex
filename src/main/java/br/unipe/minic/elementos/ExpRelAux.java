package br.unipe.minic.elementos;

public class ExpRelAux implements IExpressao {

	private IExpressao expRelAux;
	
	public ExpRelAux(IExpressao expRelAux) {
		setExpRelAux(expRelAux);
	}

	public IExpressao getExpRelAux() {
		return expRelAux;
	}

	public void setExpRelAux(IExpressao expRelAux) {
		this.expRelAux = expRelAux;
	}
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getExpRelAux());
		
	    return toString.toString();
	}

	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}
}
