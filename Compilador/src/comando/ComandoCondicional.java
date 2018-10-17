package comando;

import comandoPrimitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import parser.Token;

public abstract class ComandoCondicional extends ComandoAltoNivel {
	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	public ComandoCondicional(Token token,Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		super(token);
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {	
		return null;
	}

	public String toString() {	
		return null;
	}
}
