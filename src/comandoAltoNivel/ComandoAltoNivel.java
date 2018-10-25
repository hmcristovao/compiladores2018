package comandoAltoNivel;

import parser.Token;
import comandoPrimitivo.*;

public abstract class ComandoAltoNivel {
	
	private Token token;

	public ComandoAltoNivel(Token token) {
		this.token = token;
	}

	public String getLexema() {
        return token.image;
    }
	
	 public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
	 public abstract String toString();
}
