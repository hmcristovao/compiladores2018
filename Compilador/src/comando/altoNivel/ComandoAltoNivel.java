package comando.altoNivel;

import parser.Token;
import comando.primitivo.*;

public abstract class ComandoAltoNivel {
	Token token;
	
	public ComandoAltoNivel(Token _token) {
		this.token = _token;
	}
	
	public String getLexema() {
		return this.token.image;
	}
	
	public abstract String toString();

	public abstract ListaComandosPrimitivos geraListaComandosPrimitivo();
}
