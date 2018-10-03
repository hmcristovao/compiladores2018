package semantico;
import java.util.HashMap;

public class Tabela {
      private HashMap<String,Simbolo> tab;
      public int marcador = 1;
      
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
      
      public void vtnc(Tabela tabela, String var, Simbolo simb, String tipo) {
  	  	if(!tabela.isExiste(var)) { 
    	  	AcoesSemanticas.declaracao(tabela,var);
  		}else{

	  		simb = new Simbolo(var, tipo);
	  		simb.setReferencia(tabela, tipo);
	  		tabela.inclui(simb);
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