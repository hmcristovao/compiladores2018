package comando;

import comandoPrimitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoEnquanto extends ComandoAltoNivel {
	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	public ComandoEnquanto(Token token, Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		super(token);
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}

	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//segunda passagem
		return null;
	}
	
	public String toString() {
		
		return null;
	}

}
