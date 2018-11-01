package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;

public abstract class ComandoAltoNivel {
	
	public Token token;
		
	public String getLexama() {
		return token.image;
	}
	
	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();	
		
	public abstract String toString();

}
