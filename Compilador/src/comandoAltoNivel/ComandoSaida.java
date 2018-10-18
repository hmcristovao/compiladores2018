package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoSaida extends ComandoAltoNivel {
	
	Expressao expressao;
	
	public ComandoSaida (Expressao expressao, Token token) {
		this.expressao = expressao;
		this.token = token;
	}
	
	public String toString() {
		return this.getLexama() + " " + this.expressao.getListaExpPosFixa() + "\n";
	}

	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}

}
