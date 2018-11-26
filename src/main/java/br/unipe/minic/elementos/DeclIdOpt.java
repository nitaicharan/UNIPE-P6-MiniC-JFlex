package br.unipe.minic.elementos;

public class DeclIdOpt implements IExpressao {
	
	private Identificador identificador;
	private IExpressao declidopt;
    
    public DeclIdOpt(Identificador identificador, IExpressao declidopt) {
    	setIdentificador(identificador);
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}
    
    public IExpressao getDeclidopt() {
		return declidopt;
	}

	public void setDeclidopt(IExpressao declidopt) {
		this.declidopt = declidopt;
	}

	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append("," + this.getIdentificador());
		toString.append("," + this.getDeclidopt());
		
	    return toString.toString();    	
    }

	@Override
	public void setEntreParenteses(boolean isEntreParenteses) {
		// TODO Auto-generated method stub
		
	}
}