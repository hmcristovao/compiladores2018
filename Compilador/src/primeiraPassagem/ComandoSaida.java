package primeiraPassagem;
import geradorCodigo.*;
import parser.Token;
public class ComandoSaida extends ComandoAltoNivel{

	private Expressao expressao;
	
	public ComandoSaida(Expressao _expressao, Token _token) {
		super(_token);
		this.expressao=_expressao;
	}
	
	public String toString() {
		return super.getLexema() + this.expressao.toString();
	}
}
