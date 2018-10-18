package comandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;
import semantico.*;

public class ComandoEntrada extends ComandoAltoNivel {
	Simbolo variavel;
	
	public ComandoEntrada(Token token, Simbolo variavel) {
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
