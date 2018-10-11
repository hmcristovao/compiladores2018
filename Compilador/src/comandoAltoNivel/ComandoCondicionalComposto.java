package comandoAltoNivel;

import geradorCodigo.Expressao;

public class ComandoCondicionalComposto extends ComandoCondicional{
	
	ListaComandosAltoNivel listaComandosAltoNivelFalse;

	public ComandoCondicionalComposto(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, ListaComandosAltoNivel listaComandosAltoNivelFalse) {
		super(expressao, listaComandosAltoNivelTrue);
		this.listaComandosAltoNivelFalse = listaComandosAltoNivelFalse;
	}

	public String toString() {
		return null;
	}
	
}
