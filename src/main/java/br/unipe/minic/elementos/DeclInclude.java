package br.unipe.minic.elementos;


public class DeclInclude {
	
	 // Atributos
	
	private String identificador; 
		   
	  // Construtor

	  public DeclInclude(String identificador){

		  this.setIdentificador( identificador );

	    
	  }  

	  // Metodos


	  public String getIdentificador() {
			
		    return identificador;

		  }

	  public void setIdentificador(String identificador) {
			
		    this.identificador = identificador;

	  	  }
	  
	  	  

	  @Override
		
	  public String toString() {
		  
		  StringBuilder declarainclude = new StringBuilder();
		  
		  declarainclude.append( "#include <" );	
		  declarainclude.append( this.getIdentificador());
		  declarainclude.append( ".h>" );    
		  return declarainclude.toString();
	    
	  }
	  
	
}
