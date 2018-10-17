package comandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;
import semantico.*;

public class ComandoEnquanto extends ComandoAltoNivel{
	Expressao exp; 
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	
	public ComandoEnquanto(Token token, Expressao exp, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		
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