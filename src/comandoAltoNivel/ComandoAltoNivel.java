package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;

//import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.HeaderTokenizer.Token;

public abstract class ComandoAltoNivel {
	Token token;
	
	public ComandoAltoNivel(Token _token)
	{
		this.token = _token;
	}
	
	public String getLexema() {
		return token.image;
	}
	
	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
	
	public abstract String toString();
}
