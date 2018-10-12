package comando;

import geradorCodigo.Expressao;
import parser.Token;
import semantico.Simbolo;

public class ComandoAtribuicao extends ComandoAltoNivel {

	Simbolo variavel;
	Expressao expressao;
	
	public ComandoAtribuicao(Token _token, Simbolo _simbolo, Expressao _expressao) {
		super(_token);
		this.variavel = _simbolo;
		this.expressao = _expressao;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando atribuição\n" +"Variavel " + this.variavel.getLexema() + " recebe " + this.expressao.getListaExpPosfixa();
	}

	//public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
}
