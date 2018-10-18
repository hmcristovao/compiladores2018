package comandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;
import semantico.*;

public class ComandoCondicionalComposto extends ComandoCondicional {
	ListaComandosAltoNivel listaComandosAltoNivelFalse;
	
	public ComandoCondicionalComposto(Token token, Expressao exp, ListaComandosAltoNivel listaComandosAltoNivelFalse) {
		super(exp,token,listaComandosAltoNivelFalse);
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
