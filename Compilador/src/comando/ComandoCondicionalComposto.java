package comando;

import java.util.LinkedList;

import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalComposto extends ComandoCondicional {

	private LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	public void ListaComandosAltoNivel(){
		listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	}
	
	public ComandoCondicionalComposto(Token _token, Expressao expressao,
			ListaComandosAltoNivel listaComandosAltoNivel) {
		super(_token, expressao, listaComandosAltoNivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
