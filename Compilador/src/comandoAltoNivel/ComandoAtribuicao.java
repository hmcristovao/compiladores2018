package comandoAltoNivel;

import comandoPrimitivo.*;
import parser.Token;
import semantico.*;

public class ComandoAtribuicao extends ComandoAltoNivel {

	private Simbolo simbolo;
	private Expressao expressao;
	
	public ComandoAtribuicao (Simbolo simbolo, Expressao expressao, Token token) {
		this.simbolo = simbolo;
		this.expressao = expressao;
		this.token = token;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		PrimitivoAtribuicao comando = new PrimitivoAtribuicao(this.simbolo.getReferencia(), this.simbolo.getTipo(), this.expressao.geraCodigoDestino());
		lista.addComando(comando);
		return lista;
	}
	
	@Override
	public String toString() {
		return "\nComando Atribuicao - lexema: \""+this.getLexema() 
		     + "\" - simbolo: " + this.simbolo.getNome() 
		     + " - expressao: " + this.expressao;
	}

}
