package br.unipe.minic.elementos;

public class ComandoWhile implements IComando {
	
	IComando codWHILE;
	IExpressao expRelacional;
	
	public ComandoWhile(IExpressao ExpRelacional, IComando codWHILE) {
		setExpRelacional(expRelacional);
		setCodWHILE(codWHILE);
	}

	public IExpressao getExpRelacional() {
		return expRelacional;
	}

	public void setExpRelacional(IExpressao expRelacional) {
		this.expRelacional = expRelacional;
	}

	public IComando getCodWHILE() {
		return codWHILE;
	}

	public void setCodWHILE(IComando codWHILE) {
		this.codWHILE = codWHILE;
	}
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("while (" + this.getExpRelacional() + ") \n");
		toString.append("  " + this.getCodWHILE() + ";");
		
	    return toString.toString();		
	}

	@Override
	public void setEntreParenteses(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
