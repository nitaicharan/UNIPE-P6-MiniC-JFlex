package br.unipe.minic.elementos;

public class ExpressaoAtributicao {

  // Atributos
	
  private Identificador identificador;
  private IExpressao expressao;
 
  
  // Construtor
  
  public ExpressaoAtributicao(Identificador identificador, IExpressao expressao) {
	
    this.setIdentificador( identificador );
    this.setExpressao( expressao );
    
  }

  
  // M�todos
  
  public Identificador getIdentificador() {
	
    return identificador;

  }

  public void setIdentificador(Identificador identificador) {
	
    this.identificador = identificador;

  }

  public IExpressao getExpressao() {
	
    return expressao;

  }

  public void setExpressao(IExpressao expressao) {
	
    this.expressao = expressao;

  }
  
  @Override
	
  public String toString() {
	
    return this.getIdentificador() + " = " + this.getExpressao();
	
  }
  
}
