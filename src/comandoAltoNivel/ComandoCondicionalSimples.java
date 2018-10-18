package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;
import semantico.Expressao;

public class ComandoCondicionalSimples extends ComandoCondicional {

	public ComandoCondicionalSimples(Token token, ListaComandosAltoNivel listaComandosAltoNivelTrue, Expressao exp) {
		super(exp,token,listaComandosAltoNivelTrue);
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
