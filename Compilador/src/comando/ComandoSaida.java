package comando;

import java.util.LinkedList;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoSaida;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Item;
import semantico.Operando;
import semantico.TipoDado;

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
			
			//verifica se todos os operandos da expressão são do tipo NUM ou STR
			TipoDado tipoExpressao = TipoDado.NUM;
			for(int j = 0; j < expressaoPosfixa.size(); j++) { //pega todos os itens da expressao
				//verifica se o item é um operando
				if(expressaoPosfixa.get(j) instanceof Operando) {
					Operando operando = (Operando) expressaoPosfixa.get(j); 
					/* Se forem todos números a expressão é do tipo NUM
					 * se houver alguma string, a expressão é do tipo STR
					 * */
					if(operando.getTipoDado() == TipoDado.STR) {
						tipoExpressao = operando.getTipoDado();
					}
				}	
			}
			PrimitivoSaida primitivoSaida = new PrimitivoSaida(tipoExpressao, exp.geraCodigoDestino() );
			listaSaida.addComando(primitivoSaida);
        }
		return listaSaida;
	}

	public String toString() {
		
		return null;
	}

}
