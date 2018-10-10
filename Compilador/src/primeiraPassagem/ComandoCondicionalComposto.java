package primeiraPassagem;

import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalComposto extends ComandoCondicional{
	public ListaComandoAltoNivel listaComandoAltoNivelFalse;
	
	public ComandoCondicionalComposto(Expressao _expressao, ListaComandoAltoNivel _listaComandoAltoNivelTrue, ListaComandoAltoNivel _listaComandoAltoNivelFalse, Token _token){
		super(_expressao, _listaComandoAltoNivelTrue,_token);
		this.listaComandoAltoNivelFalse=_listaComandoAltoNivelFalse;
	}
	
	public String toString() {
		return super.expressao.toString() + super.listaComandoAltoNivelTrue.toString() + this.listaComandoAltoNivelFalse.toString();
	}
}
