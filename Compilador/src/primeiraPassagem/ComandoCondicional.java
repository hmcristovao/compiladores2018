package primeiraPassagem;
import geradorCodigo.*;
import parser.Token;
public abstract class ComandoCondicional extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandoAltoNivel listaComandoAltoNivelTrue;
	
	public ComandoCondicional(Expressao _expressao,ListaComandoAltoNivel _listaComandoAltoNivelTrue, Token _token) {
		super(_token);
		this.expressao=_expressao;
		this.listaComandoAltoNivelTrue=_listaComandoAltoNivelTrue;
	}
}
