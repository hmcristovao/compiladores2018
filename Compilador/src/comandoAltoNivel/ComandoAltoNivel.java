package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;

public abstract class ComandoAltoNivel {
	
	Token token;
	
	String getLexama() {
		return null;
	}
	
	abstract ListaComandosPrimitivos geraListaComandosPrimitivos();	
	
	abstract public String toString();

}
