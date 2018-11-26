package br.unipe.minic.elementos;

public class ComandoAtribuicao implements IComando {
	
	String tipo;
	Identificador identificador;
	IExpressao DeclaraOpt;
	
	public ComandoAtribuicao(String tipo, Identificador identificador, IExpressao DeclaraOpt) {
		this.setTipo(tipo);
		this.setIdentificador(identificador);
		this.setDeclOpt(DeclaraOpt);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public IExpressao getDeclOpt() {
		return DeclaraOpt;
	}

	public void setDeclOpt(IExpressao DeclaraOpt) {
		this.DeclaraOpt = DeclaraOpt;
	}
	
	public String toString() {
		StringBuilder dclcmdtipatropt = new StringBuilder();
        String retorno;
        if (this.DeclaraOpt != null) {
            retorno = this.tipo + " " + this.identificador.toString() + " " + this.DeclaraOpt.toString() + ";";
        }
        else{
            retorno = this.tipo + " " + this.identificador.toString() + ";";
        }
        
        dclcmdtipatropt.append(retorno);
        return dclcmdtipatropt.toString();
    }

	@Override
	public void setEntreParenteses(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
