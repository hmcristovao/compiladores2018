package comando;

import parser.Token;

public abstract class ComandoAltoNivel {

	Token token;
	
	public ComandoAltoNivel(Token token) {
		this.token = token;
	}
	
	public String getLexema() {
		return null;
	}
	
	public abstract String toString();
	}
