package comando;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;

public class ComandoDeclaracao extends ComandoAltoNivel {

	
	public ComandoDeclaracao(Token token) {
		super(token);
	}


	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		return null;
	}

	
	public String toString(){
		return "declaracao:";
	}

}
