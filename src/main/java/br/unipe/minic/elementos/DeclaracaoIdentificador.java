package br.unipe.minic.elementos;

public class DeclaracaoIdentificador {
	
	private Identificador id;
	private IExpressao expressao;
		
	public DeclaracaoIdentificador (Identificador id, IExpressao expressao) {
		setId(id);
		setExpressao(expressao);
	}

	public Identificador getId() {
		return id;
	}

	public void setId(Identificador id) {
		this.id = id;
	}

	public IExpressao getExpressao() {
		return expressao;
	}

	public void setExpressao(IExpressao expressao) {
		this.expressao = expressao;
	}
	
	public String toString() {
		StringBuilder toString = new StringBuilder();
		
		toString.append(this.getId());
		toString.append(this.getExpressao());
		
	    return toString.toString();		
	}
}