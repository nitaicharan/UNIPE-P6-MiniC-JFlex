package br.unipe.minic.elementos;

public class ComandoPrintint implements IComando {
	private boolean EntreParenteses;
	private IExpressao exp;
	
	public ComandoPrintint(IExpressao exp) {
		setExp(exp);
	}

	public IExpressao getExp() {
		return exp;
	}

	public void setExp(IExpressao exp) {
		this.exp = exp;
	}
	public boolean EntreParenteses() {
        return EntreParenteses;
    }

    public void setEntreParenteses(boolean EntreParenteses) {
        this.EntreParenteses = EntreParenteses;
    }

	
	public String toString() {
		StringBuilder comandoprintint = new StringBuilder();
		
		if(this.EntreParenteses){
	        String retorno = "printf(" + this.exp.toString() + ");";
	        comandoprintint.append(retorno);
	    }
	    else{
	        String retorno = "printf" + this.exp.toString() + ";";
	        comandoprintint.append(retorno);
	    }
	    
	    return comandoprintint.toString();		
	}

}


