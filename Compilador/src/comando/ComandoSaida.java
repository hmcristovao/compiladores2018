package comando;

import java.util.LinkedList;

import geradorCodigo.Expressao;
import parser.Token;
import semantico.Item;

public class ComandoSaida extends ComandoAltoNivel {
	LinkedList<Expressao> expressoes;
	public ComandoSaida(Token token, LinkedList<Expressao> expressoes) {
		super(token);
		this.expressoes = expressoes;
	}

	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// segunda passagem
		return null;
	}

	public String toString() {
		
		return null;
	}

}
