package primeiraPassagem;
import geradorCodigo.*;
public abstract class ComandoCondicional extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandoAltoNivel listaComandoAltoNivelTrue;
	
	public ComandoCondicional(Expressao _expressao,ListaComandoAltoNivel _listaComandoAltoNivelTrue) {
		this.expressao=_expressao;
		this.listaComandoAltoNivelTrue=_listaComandoAltoNivelTrue;
	}
	
	public abstract String toString();
}
