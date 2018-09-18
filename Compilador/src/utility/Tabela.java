package utility;

import java.util.HashMap;
public class Tabela {
      private HashMap<String,Simbolo> tab;
      public Tabela() {
            this.tab = new HashMap<String,Simbolo>();
      }
      public boolean push(Simbolo novo) {
            if(this.tab.containsKey(novo.getName()))
                  return false;
            else {
                  this.tab.put(novo.getName(),novo);
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
