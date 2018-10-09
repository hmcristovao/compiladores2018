package primeiraPassagem;
import semantico.*;
import geradorCodigo.*;
public class ComandoAtribuicao extends ComandoAltoNivel{
	Simbolo variavel;
	Expressao expressao;
	
	public ComandoAtribuicao(Simbolo _variavel, Expressao _expressao) {
		this.variavel=_variavel;
		this.expressao=_expressao;
	}
	public String toString() {
		return null;
	}
}
