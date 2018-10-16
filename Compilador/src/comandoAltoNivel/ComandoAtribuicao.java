package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import semantico.*;

public class ComandoAtribuicao extends ComandoAltoNivel {

	Simbolo simbolo;
	Expressao expressao;
	
	public ComandoAtribuicao (Simbolo simbolo, Expressao expressao) {
		this.simbolo = simbolo;
		this.expressao = expressao;
	}
	
	public String toString() {
		return "Atribuicao " + this.simbolo.getNome() + this.expressao.getListaExpPosFixa() + "\n";
	}

	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
