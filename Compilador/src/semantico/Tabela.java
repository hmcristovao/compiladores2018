package semantico;
import java.util.HashMap;

public class Tabela {
      private HashMap<String,Simbolo> tab;

      public Tabela() {
            this.tab = new HashMap<String,Simbolo>();
      }
  
      public boolean incluiSimbolo(Simbolo _simb) {
            if(this.tab.containsKey(_simb.getNome()))
                  return false;
            else {
                  this.tab.put(_simb.getNome(),_simb);
                  return true;
            }
      }
      
      public boolean verificaExistenciaSimbolo(String _chave) {
          return this.tab.containsKey(_chave);
      }
      
      public Simbolo consultaSimbolo(String _chave) {
    	  return (Simbolo); //terminar aqui
      }
      
      public int consultaReferencia(String _chave) {
            return ((Simbolo)this.tab.get(_chave)).getReferencia();
      }
      
      public String toString() {
            return this.tab.toString();

      }
}