package comando;

import java.util.LinkedList;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoEntrada;
import comandoPrimitivo.PrimitivoSaida;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Item;
import semantico.Simbolo;

public class ComandoSaida extends ComandoAltoNivel {
	LinkedList<Expressao> expressoes;
	public ComandoSaida(Token token, LinkedList<Expressao> expressoes) {
		super(token);
		this.expressoes = expressoes;
	}

	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// segunda passagem
		ListaComandosPrimitivos listaSaida = new ListaComandosPrimitivos();
		//gera um primitivo de entrada para cada variavel
		for (int i = 0; i < this.expressoes.size(); i++) {
			Expressao exp = this.expressoes.get(i);
			PrimitivoSaida primitivoSaida = new PrimitivoSaida(null, exp.geraCodigoDestino() );
			listaSaida.addComando(primitivoSaida);
        }
		
		return listaSaida;
	}

	public String toString() {
		
		return null;
	}

}
