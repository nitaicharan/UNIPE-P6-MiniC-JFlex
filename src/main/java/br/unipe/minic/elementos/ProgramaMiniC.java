
package br.unipe.minic.elementos;

import java.util.List;

public class ProgramaMiniC {
	
  private FuncaoMain funcaoMain;
  private List<DeclaracaoFuncao> declFuncoes;
  private List<DeclaracaoInclude> declIncludes;


  public ProgramaMiniC(List<DeclaracaoInclude> declIncludes, FuncaoMain funcaoMain, List<DeclaracaoFuncao> declFuncoes) {

    this.setFuncaoMain( funcaoMain );
    this.setDeclFuncoes( declFuncoes );
    this.setDeclIncludes( declIncludes );
  }
 
  
  public FuncaoMain getFuncaoMain() {
	
    return funcaoMain;
	
  }
 
  public void setFuncaoMain(FuncaoMain funcaoMain) {
	
    this.funcaoMain = funcaoMain;
	
  }

  public List<DeclaracaoFuncao> getDeclFuncoes() {
	
    return declFuncoes;
	
  }

  public void setDeclFuncoes(List<DeclaracaoFuncao> declFuncoes) {
	
    this.declFuncoes = declFuncoes;
	
  }
  
  public List<DeclaracaoInclude> getDeclIncludes() {
	return declIncludes;
  }


  public void setDeclIncludes(List<DeclaracaoInclude> declIncludes) {
	this.declIncludes = declIncludes;
  }


@Override
	
  public String toString() {
	
    StringBuilder programaMiniC = new StringBuilder();
    
    programaMiniC.append( "\n" );
    
    if( this.declIncludes != null ) {
    	
        for(DeclaracaoInclude declIncludes: this.declIncludes) {
        	  
          programaMiniC.append( declIncludes.toString() );
          programaMiniC.append( "\n" );
          
        }
        
      }
    
    programaMiniC.append( "\n" );
    programaMiniC.append( "\n" );
    
    programaMiniC.append( this.funcaoMain.toString() );
    
    programaMiniC.append( "\n" );
    programaMiniC.append( "\n" );
    
    if( this.declFuncoes != null ) {
    	
      for(DeclaracaoFuncao declaracaoFuncao: this.declFuncoes) {
      	  
        programaMiniC.append( declaracaoFuncao.toString() );
        programaMiniC.append( "\n" );
        
      }
      
    }
    
    return programaMiniC.toString();
    
  }
  
}
