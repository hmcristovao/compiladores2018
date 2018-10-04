package semantico;

import java.util.HashMap;

public class Tabela {
	 
	private HashMap<String,Simbolo> tab;
	private int marcador;
	
	
	
    public Tabela() {
          this.tab = new HashMap<String,Simbolo>();
          this.setMarcador(1);
    }
    
	public  int getMarcador() {
		return this.marcador;
	}


	public void setMarcador(int marcador) {
		this.marcador = marcador;
	}
	
    public boolean inclui(Simbolo _simb) {
          if(this.tab.containsKey(_simb.getNome()))
                return false;
          else {
        	    _simb.setReferencia(marcador);
                this.tab.put(_simb.getNome(),_simb);
                
                if(_simb.getTipo().equals(Tipo.NUMERO)) {
                	this.marcador +=2;
                }
                else {
                	this.marcador++;
                }
                
                return true;
          }
    }
    
    public int consultaReferencia(String _chave) {
          return ((Simbolo)this.tab.get(_chave)).getReferencia();
    }
    
    public boolean isExiste(String _chave) {
          return this.tab.containsKey(_chave);
    }
    
    public String toString() {
          return this.tab.toString();

    }
}
