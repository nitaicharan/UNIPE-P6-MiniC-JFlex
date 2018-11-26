package br.unipe.minic.elementos;

public class ExpressaoBinaria implements IExpressao {

  // Atributos
	
  private IExpressao expressaoEsquerda;
  private String operador;
  private IExpressao expressaoDireita;
  
  
  // Construtor
  
  public ExpressaoBinaria(IExpressao expressaoEsquerda, String operador, IExpressao expressaoDireita) {

	this.setExpressaoEsquerda( expressaoEsquerda );
	this.setOperador( operador );
    this.setExpressaoDireita( expressaoDireita );
    
  }

  
  // M�todos
  
  public IExpressao getExpressaoEsquerda() {
	
    return expressaoEsquerda;

  }

  public void setExpressaoEsquerda(IExpressao expressaoEsquerda) {
	
    this.expressaoEsquerda = expressaoEsquerda;

  }

  public String getOperador() {
	
    return operador;

  }

  public void setOperador(String operador) {
	
    this.operador = operador;

  }

  public IExpressao getExpressaoDireita() {
	
    return expressaoDireita;

  }

  public void setExpressaoDireita(IExpressao expressaoDireita) {
	
    this.expressaoDireita = expressaoDireita;

  }

  @Override
	
  public String toString() {
	
	return this.getExpressaoEsquerda() + " " + this.getOperador() + " " + this.getExpressaoDireita();
	
  }


@Override
public void setEntreParenteses(boolean isEntreParenteses) {
	// TODO Auto-generated method stub
	
}
  
}
