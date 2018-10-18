package comando;

import java.util.LinkedList;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoEntrada;
import parser.Token;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel{
	LinkedList<Simbolo> variaveis;
	public ComandoEntrada(Token token, LinkedList<Simbolo> variaveis){
		super(token);
		this.variaveis = variaveis;
	}


	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//implementar na segunda passagem
		ListaComandosPrimitivos listaEntrada = new ListaComandosPrimitivos();
		//gera um primitivo de entrada para cada variavel
		for (int i = 0; i < this.variaveis.size(); i++) {
			Simbolo simb = this.variaveis.get(i);
			PrimitivoEntrada primitivoEntrada = new PrimitivoEntrada(simb.getReferencia(), simb.getTipo());
			listaEntrada.addComando(primitivoEntrada);
        }
		return listaEntrada;
	}

	public String toString() {
		String entradaString = "";
		for (int i = 0; i < this.variaveis.size(); i++) {
			entradaString += " var: "+this.variaveis.get(i).getNome();
        }
		return entradaString;
	}
}
