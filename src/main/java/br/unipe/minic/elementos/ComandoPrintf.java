package br.unipe.minic.elementos;

public class ComandoPrintf implements IComando {
	
	IExpressao exp;
	
	public ComandoPrintf(IExpressao exp) {
		setExp(exp);
	}

	public IExpressao getExp() {
		return exp;
	}

	public void setExp(IExpressao exp) {
		this.exp = exp;
	}

	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("Printf(" + this.getExp() + ");");
		
	    return toString.toString();		
	}

	@Override
	public void setEntreParenteses(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
