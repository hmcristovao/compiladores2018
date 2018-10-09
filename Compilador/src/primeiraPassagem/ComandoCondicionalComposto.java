package primeiraPassagem;

import geradorCodigo.Expressao;

public class ComandoCondicionalComposto extends ComandoCondicional{
	public ListaComandoAltoNivel listaComandoAltoNivelFalse;
	
	public ComandoCondicionalComposto(Expressao _expressao, ListaComandoAltoNivel _listaComandoAltoNivelTrue, ListaComandoAltoNivel _listaComandoAltoNivelFalse){
		super(_expressao, _listaComandoAltoNivelTrue);
		this.listaComandoAltoNivelFalse=_listaComandoAltoNivelFalse;
	}
	
	public String toString() {
		return null;
	}
}
