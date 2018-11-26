package br.unipe.minic.elementos;

public class Identificador implements IExpressao {

  // Atributos
	
  private String nome;
  
  
  // Construtor
  
  public Identificador(String nome) {

    this.setNome( nome );    
  
  }

  
  // M�todos
  
  public String getNome() {
	
    return nome;

  }

  public void setNome(String nome) {
	
    this.nome = nome;

  }
  
  @Override
	
  public String toString() {
	
    return this.getNome();
    
  }


@Override
public void setEntreParenteses(boolean isEntreParenteses) {
	// TODO Auto-generated method stub
	
}
  
}
