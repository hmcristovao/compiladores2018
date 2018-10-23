package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;

public abstract class ComandoAltoNivel {
	
	Token token;
		
	String getLexama() {
		return token.image;
	}
	
	abstract ListaComandosPrimitivos geraListaComandosPrimitivos();	
		
	abstract public String toString();

}
