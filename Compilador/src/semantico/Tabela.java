package semantico;
import java.util.HashMap;

public class Tabela {
      private HashMap<String,Simbolo> tabela;
      private int marcador;
      
      public Tabela() {
            this.tabela = new HashMap<String,Simbolo>();
      }
      
      public boolean inclui(Simbolo _simbolo) {
    	  	if(this.tabela.containsKey(_simbolo.getLexema()))
                return false;
            else {
            	this.tabela.put(_simbolo.getLexema(),_simbolo);
                return true;
            }
      }    
      
      public int consultaReferencia(String _chave) {
            return ((Simbolo)this.tabela.get(_chave)).getReferencia();
      }
      
      public boolean isExiste(String _chave) {
          if(this.tabela.containsKey(_chave))   
        	  return true;
          else {
        	  return false;
          }
      }
      
      public int get_marcador() {
		return marcador;
      }
      
      public void set_marcador(int _marcador) {
		this.marcador = _marcador;
      }
      
      public String toString() {
            return this.tabela.toString();
      }
}
     