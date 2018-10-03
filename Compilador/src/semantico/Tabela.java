package semantico;
import java.util.HashMap;

public class Tabela {
      private HashMap<String,Simbolo> _tab;
 private int _marcador;
      
      public Tabela() {
            this._tab = new HashMap<String,Simbolo>();
      }
      public boolean inclui(Simbolo _simb) {
            if(this._tab.containsKey(_simb.getNome()))
                  return false;
            else {
                  this._tab.put(_simb.getNome(),_simb);
                  return true;
            }
      }    
      
      public int consultaReferencia(String _chave) {
            return ((Simbolo)this._tab.get(_chave)).getReferencia();
      }
      public boolean isExiste(String _chave) {
          if(this._tab.containsKey(_chave))   
        	  return true;
          else {
        	  return false;
          }
      }
      
      public int get_marcador() {
		return _marcador;
	}
	public void set_marcador(int _marcador) {
		this._marcador = _marcador;
	}
	public String toString() {
            return this._tab.toString();
      }
}
     