package parser;
import comandoAltoNivel.ComandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import semantico.*;


public class ComandoSaida extends ComandoAltoNivel {
	Expressao exp; 
	
	public ComandoSaida(Token token, Expressao exp) {
		
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
