package semantico;

import java.util.HashMap;
public class Tabela {
	private HashMap<String,Simbolo> tab;
	private static int index = 0;
 
	public Tabela() {
            this.tab = new HashMap<String,Simbolo>();
	}
  		
	public boolean incluiSimbolo(Simbolo simb) {
            if(this.tab.containsKey(simb.getLexema())) {
            	return false;
            }else {
                  this.tab.put(simb.getLexema(),simb);
                  return true;
            }
	}
  		
	public boolean verificaExistenciaSimbolo(String ch) {
            return this.tab.containsKey(ch);
	}
    
	public Simbolo consultaSimbolo(String ch) {
        return ((Simbolo)this.tab.get(ch));
	}
	
	public int consultaReferencia(String ch) {
            return ((Simbolo)this.tab.get(ch)).getReferencia();
	}
	
	public TipoDado consultaTipo(String ch) {
        return ((Simbolo)this.tab.get(ch)).getTipo();
	}
	
	public static int getRef(TipoDado tipo) {
		int aux = index;
		if (tipo == TipoDado.NUMERO)
			index+=2;
		else
			index+=1;
		return aux;
	}
            
	public String toString() {
            return this.tab.toString();
	}
}
