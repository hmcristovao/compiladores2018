package comandos;
import semantico.*;
import geradorCodigo.*;
import parser.Token;

public class ComandoAtribuicao extends ComandoAltoNivel {
	Simbolo variavel;
	Expressao expressao;
	
	public ComandoAtribuicao(Simbolo simb, Expressao exp, Token token) {
		super(token);
		this.variavel = simb;
		this.expressao = exp;
	}
	
	public String toString() {
		return this.variavel + "" + this.expressao.listaExpPosfixa;
	}
	
}
