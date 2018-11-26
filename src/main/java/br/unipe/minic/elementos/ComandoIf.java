package br.unipe.minic.elementos;

public class ComandoIf implements IComando {
	
	IExpressao expRelacional;
	IComando codIF;
	private boolean isEntreParenteses;

	public ComandoIf(IExpressao expRelacional, IComando codIF) {
		setExpRelacional(expRelacional);
		setCodIF(codIF);
	}
	
	public void setEntreParenteses(boolean isEntreParenteses) {
        this.isEntreParenteses = isEntreParenteses;
    }
	
	
	public IExpressao getExpRelacional() {
		return expRelacional;
	}

	public void setExpRelacional(IExpressao expRelacional) {
		this.expRelacional = expRelacional;
	}

	public IComando getCodIF() {
		return codIF;
	}

	public void setCodIF(IComando codIF) {
		this.codIF = codIF;
	}
	
	public String toString() {
		StringBuilder comandoif = new StringBuilder();
		
		comandoif.append("if (" + this.getExpRelacional() + ") \n");
		comandoif.append("  " + this.getCodIF() + ";");
		
	    return comandoif.toString();
	}


}
