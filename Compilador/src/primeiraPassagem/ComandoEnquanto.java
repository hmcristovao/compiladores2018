package primeiraPassagem;
import geradorCodigo.*;
import parser.Token;
public class ComandoEnquanto extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandoAltoNivel listaComandoAltoNivelTrue;
	
	public ComandoEnquanto(Expressao _expressao,ListaComandoAltoNivel _listaComandoAltoNivelTrue, Token _token) {
		super(_token);
		this.expressao=_expressao;
		this.listaComandoAltoNivelTrue=_listaComandoAltoNivelTrue;	
	}
	
	public String toString() {
		return super.getLexema() + this.expressao.toString() + this.listaComandoAltoNivelTrue.toString();
	}
}
