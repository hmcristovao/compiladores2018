package comando;

import java.util.LinkedList;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoEntrada;
import comandoPrimitivo.PrimitivoSaida;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Item;
import semantico.Operando;
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
		//gera um primitivo de saida para cada variavel
		for (int i = 0; i < this.expressoes.size(); i++) {
			Expressao exp = this.expressoes.get(i);
			//cria um primitivo de saida para cada item da expressão
			LinkedList<Item> expressaoPosfixa = exp.getExpressaoPosfixa();
			for(int j = 0; j < expressaoPosfixa.size(); j++) { //pega todos os itens da expressao
				//verifica se o item é um operando
				if(expressaoPosfixa.get(j) instanceof Operando) {
					Operando operando = (Operando) expressaoPosfixa.get(j); 
					PrimitivoSaida primitivoSaida = new PrimitivoSaida(operando.getTipoDado(), exp.geraCodigoDestino() );
					listaSaida.addComando(primitivoSaida);
				}	
			}
        }
		return listaSaida;
	}

	public String toString() {
		
		return null;
	}

}
