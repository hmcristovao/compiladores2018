package comando;

import geradorCodigo.Expressao;
import parser.Token;
import semantico.Simbolo;

public class ComandoAtribuicao extends ComandoAltoNivel{
	private Simbolo variavel;
	private Expressao expressao;
	
	public ComandoAtribuicao(Token _token, Simbolo _variavel, Expressao _expressao) {
		super(_token);
		this.variavel = _variavel;
		this.expressao = _expressao;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.variavel.toString() + super.getLexema() + this.expressao.getExpressaoExpPosfixa();
	}
	
}
