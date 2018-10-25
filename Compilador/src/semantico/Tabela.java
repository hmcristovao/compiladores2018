package semantico;
import java.util.HashMap;

public class Tabela {
      public static HashMap<String,Simbolo> tabela;
      private int marcador;
      
      public Tabela() {
            Tabela.tabela = new HashMap<String,Simbolo>();
      }
      
      public boolean inclui(Simbolo _simbolo) {
    	  	if(Tabela.tabela.containsKey(_simbolo.getLexema()))
                return false;
            else {
            	Tabela.tabela.put(_simbolo.getLexema(),_simbolo);
                return true;
            }
      }    
      
      public int consultaReferencia(String _chave) {
            return ((Simbolo)Tabela.tabela.get(_chave)).getReferencia();
      }
      
      public Simbolo consultaSimbolo(String _chave) {
    	  return ((Simbolo)Tabela.tabela.get(_chave));
      }
      
      public boolean isExiste(String _chave) {
          if(Tabela.tabela.containsKey(_chave))   
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
            return Tabela.tabela.toString();
      }
}
     