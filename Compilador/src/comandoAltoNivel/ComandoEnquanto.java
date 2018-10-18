package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoEnquanto extends ComandoAltoNivel{
	
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	Expressao expressao;
	
	public ComandoEnquanto (Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
		this.token = token;
	}
	
	public String toString() {
		return this.getLexama() + " " + this.expressao.getListaExpPosFixa() + " "  + "\n";
	}

	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}

}
