package comando;

import parser.Token;
import semantico.Simbolo;

public class ComandoEntrada extends ComandoAltoNivel{
	Simbolo variavel;
	public ComandoEntrada(Token token, Simbolo simbolo){
		super(token);
		this.variavel = simbolo;
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
