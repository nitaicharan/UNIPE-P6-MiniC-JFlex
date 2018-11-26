package br.unipe.minic.elementos;

import java.util.ArrayList;


public class ComandoDeclIdentificadores implements IComando {
	private String tipo;
	private Identificador id;
	private IExpressao exp;
	private ArrayList<DeclaracaoIDAtr> declOpt;
	
	public ComandoDeclIdentificadores(String tipo,Identificador id,IExpressao exp,ArrayList<DeclaracaoIDAtr> declOpt) {
		this.setTipo(tipo);
		this.setId(id);
		this.setExp(exp);
		this.setDeclOpt(declOpt);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Identificador getId() {
		return id;
	}

	public void setId(Identificador id) {
		this.id = id;
	}

	public IExpressao getExp() {
		return exp;
	}

	public void setExp(IExpressao exp) {
		this.exp = exp;
	}


	public ArrayList<DeclaracaoIDAtr> getDeclOpt() {
		return declOpt;
	}

	public void setDeclOpt(ArrayList<DeclaracaoIDAtr> declOpt) {
		this.declOpt = declOpt;
	}


	@Override
    public String toString() {
        StringBuilder dclcomatropt = new StringBuilder();
        String retorno = this.tipo + " " + this.id.toString() + " = " + this.exp.toString();
        dclcomatropt.append(retorno);
        if( this.declOpt != null ) {
            for(DeclaracaoIDAtr DeclaracaoIDAtribuicao: this.declOpt) {
                dclcomatropt.append(" ");
                dclcomatropt.append( DeclaracaoIDAtribuicao.toString() );
          }
        }
        dclcomatropt.append(" ;");
        return dclcomatropt.toString();
    }

	@Override
	public void setEntreParenteses(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
