package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.*;

public class ComandoAtribuicao extends ComandoAltoNivel {

	Simbolo simbolo;
	Expressao expressao;
	
	public ComandoAtribuicao (Simbolo simbolo, Expressao expressao, Token token) {
		this.simbolo = simbolo;
		this.expressao = expressao;
		this.token = token;
	}
	
	public String toString() {
		return this.getLexama() + " " + this.simbolo.getNome() + " " + this.expressao.getListaExpPosFixa() + "\n";
	}

	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
