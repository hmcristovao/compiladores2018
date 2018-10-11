package comando;

import parser.Token;

public abstract class ComandoAltoNivel {
	Token token;
	
	public ComandoAltoNivel(Token _token) {
		this.token = _token;
	}
	
	public String getLexema() {
		return null;
	}
	
	public abstract String toString();

	//public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
}
