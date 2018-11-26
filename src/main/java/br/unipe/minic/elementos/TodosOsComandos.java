package br.unipe.minic.elementos;
import java.util.ArrayList;

public class TodosOsComandos implements IComando {
	
	ArrayList<IComando> comandosOpt;
	
	public TodosOsComandos(ArrayList<IComando> comandosOpt) {
		setComandosOpt(comandosOpt);
	}

	public ArrayList<IComando> getComandosOpt() {
		return comandosOpt;
	}

	public void setComandosOpt(ArrayList<IComando> comandosOpt) {
		this.comandosOpt = comandosOpt;
	}

	public String toString() {
		StringBuilder BlocoDeComandos = new StringBuilder();
        if( this.comandosOpt != null ) {
            for(IComando ComandoOpt: this.comandosOpt) {

            BlocoDeComandos.append( ComandoOpt.toString() );
            BlocoDeComandos.append( "\n" );

          }
        }
        return BlocoDeComandos.toString();
	}

	@Override
	public void setEntreParenteses(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
