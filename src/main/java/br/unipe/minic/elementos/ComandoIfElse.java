package br.unipe.minic.elementos;

public class ComandoIfElse implements IComando {
	
	IExpressao expRelacional;
	IComando codIF, codElse;

	public ComandoIfElse(IExpressao expRelacional, IComando codIF, IComando codElse) {
		setExpRelacional(expRelacional);
		setCodIF(codIF);
		setCodElse(codElse);
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

	public IComando getCodElse() {
		return codElse;
	}

	public void setCodElse(IComando codElse) {
		this.codElse = codElse;
	}
	
	public String toString() {
		StringBuilder comandoifelse = new StringBuilder();
		
		comandoifelse.append("if (" + this.getExpRelacional() + ") \n");
		comandoifelse.append("  " + this.getCodIF() + ";\n");	
		comandoifelse.append("else \n" );
		comandoifelse.append("  " +  this.getCodElse().toString() );
		
	    return comandoifelse.toString();
	}

	@Override
	public void setEntreParenteses(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
