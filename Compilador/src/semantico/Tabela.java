package semantico;
import java.util.HashMap;

public class Tabela {
      private HashMap<String,Simbolo> tab;

      public Tabela() {
            this.tab = new HashMap<String,Simbolo>();
      }
  
      public boolean inclui(Simbolo _simb) {
            if(this.tab.containsKey(_simb.getNome()))
                  return false;
            else {
                  this.tab.put(_simb.getNome(),_simb);
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