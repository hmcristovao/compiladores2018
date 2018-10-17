package comando;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoAtribuicao;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Simbolo;

public class ComandoAtribuicao extends ComandoAltoNivel{
	Simbolo variavel;
	Expressao expressao;
	public ComandoAtribuicao(Token token, Simbolo simbolo, Expressao expressao) {
		super(token);
		this.variavel = simbolo;
		this.expressao = expressao;
	}

	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//implementar na segunda passagem		
		return null;
	}

	public String toString() {
		
		return null;
	}

}
