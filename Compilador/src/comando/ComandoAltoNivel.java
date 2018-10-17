package comando;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;

public abstract class ComandoAltoNivel {
	Token token;
	public ComandoAltoNivel(Token token) {
		this.token = token;
	}
	
	public String getLexema() {
		return token.image;
	}
	
	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
	
	public abstract String toString();
}
