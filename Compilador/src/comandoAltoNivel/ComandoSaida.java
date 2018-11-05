package comandoAltoNivel;

import comandoPrimitivo.*;
import parser.Token;
import semantico.*;

public class ComandoSaida extends ComandoAltoNivel {
	
	private Expressao expressao;
	
	public ComandoSaida (Expressao expressao, Token token) {
		this.expressao = expressao;
		this.token = token;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		PrimitivoSaida comando = new PrimitivoSaida(expressao.getTipo(),expressao.geraCodigoDestino());
		lista.addComando(comando);			
		return lista;
	}
	
	@Override
	public String toString() {
		return "\nComando Saida - lexema: \"" + this.getLexema() 
		     + "\" - expressao: " +  this.expressao;
	}

}
