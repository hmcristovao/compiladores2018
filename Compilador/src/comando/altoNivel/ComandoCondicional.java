package comando.altoNivel;

import geradorCodigo.Expressao;
import parser.Token;

public abstract class ComandoCondicional extends ComandoAltoNivel {
	
	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;

	public ComandoCondicional(Token _token, Expressao _expressao, ListaComandosAltoNivel _listaComandosAltoNivel) {
		super(_token);
		this.expressao = _expressao;
		this.listaComandosAltoNivelTrue = _listaComandosAltoNivel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public ListaComandosAltoNivel getListaComandosAltoNivelTrue() {
		// TODO Auto-generated method stub
		return this.listaComandosAltoNivelTrue;
	}

}
