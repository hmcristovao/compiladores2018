package semantico;

import java.util.HashMap;
public class Tabela {
      private HashMap<String,Simbolo> tab;
  		private static int index = 0;
 
  		public Tabela() {
            this.tab = new HashMap<String,Simbolo>();
      }
      public boolean push(String nome, int ref) {
    	  Simbolo novo = new Simbolo(nome,ref);
            if(this.tab.containsKey(novo.getName())) {
            	return false;
            }else {
                  this.tab.put(novo.getName(),novo);
                  int aux=index;
                  Tabela.index += novo.getRef();
                  novo.setRef(aux);
                  return true;
            }
      }
      public int consultaRef(String ch) {
            return ((Simbolo)this.tab.get(ch)).getRef();
      }
      public boolean existe(String ch) {
            return this.tab.containsKey(ch);
      }
      public String imprime() {
            return this.tab.toString();
      }
}
