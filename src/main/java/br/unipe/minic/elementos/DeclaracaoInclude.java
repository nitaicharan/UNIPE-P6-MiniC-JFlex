package br.unipe.minic.elementos;

public class DeclaracaoInclude {
	
	private String identificador;
	
	public DeclaracaoInclude(String identificador) {
		setIdentificador(identificador);
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	@Override
	public String toString() {
	    StringBuilder declaracaoInclude = new StringBuilder();
	    
	    declaracaoInclude.append("#include<" + this.getIdentificador() + ".h>" );   
	    
		return declaracaoInclude.toString();
	}

}
