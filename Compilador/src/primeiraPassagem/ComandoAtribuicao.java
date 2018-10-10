package primeiraPassagem;
import semantico.*;
import geradorCodigo.*;
import parser.Token;
public class ComandoAtribuicao extends ComandoAltoNivel{
	private Simbolo variavel;
	private Expressao expressao;
	
	public ComandoAtribuicao(Simbolo _variavel, Expressao _expressao, Token _token) {
		super(_token);
		this.variavel=_variavel;
		this.expressao=_expressao;
	}
	public String toString() {
		return this.variavel.toString() + super.getLexema() + this.expressao.toString();
	}
}
