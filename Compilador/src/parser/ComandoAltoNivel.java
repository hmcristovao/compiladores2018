package parser;

import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.HeaderTokenizer.Token;

public abstract class ComandoAltoNivel {
	Token token;
	
	public String getLexema() {
		return token.toString();
	}
	
	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
	
	public abstract String toString();
}
