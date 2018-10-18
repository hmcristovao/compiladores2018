package comandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;
import semantico.*;


public class ComandoSaida extends ComandoAltoNivel {
	Expressao exp; 
	
	public ComandoSaida(Token token, Expressao exp) {
		super(token);
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
