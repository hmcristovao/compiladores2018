package comandoAltoNivel;

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
		return "atribuicao " + this.simbolo.getNome() + this.expressao.getListaExpPosFixa() + "\n";
	}
	
}
