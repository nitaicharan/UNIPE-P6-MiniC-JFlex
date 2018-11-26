package br.unipe.minic.elementos;

public class ExpRel implements IExpressao{

    private boolean EntreParenteses;
	private IExpressao expRelAux;
	private String opREL;
	private IExpressao expRelAux2;
	
	public ExpRel(IExpressao expRelAux, String opREL, IExpressao expRelAux2) {
		this.setExpRelAux(expRelAux);
		this.setOpREL(opREL);
		this.setExpRelAux2(expRelAux2);
		
	}
	
	public boolean EntreParenteses() {
        return EntreParenteses;
    }

    public void setEntreParenteses(boolean EntreParenteses) {
        this.EntreParenteses = EntreParenteses;
    }
	
	
	
	public IExpressao getExpRelAux() {
		return expRelAux;
	}

	public void setExpRelAux(IExpressao expRelAux) {
		this.expRelAux = expRelAux;
	}

	public String getOpREL() {
		return opREL;
	}

	public void setOpREL(String opREL) {
		this.opREL = opREL;
	}

	public IExpressao getExpRelAux2() {
		return expRelAux2;
	}

	public void setExpRelAux2(IExpressao expRelAux2) {
		this.expRelAux2 = expRelAux2;
	}

	public String toString() {
		StringBuilder toString = new StringBuilder();
		String retorno =this.expRelAux.toString() + " " + this.opREL + " " + this.expRelAux.toString();
		toString.append(retorno);
		
	    return toString.toString();
	}
}