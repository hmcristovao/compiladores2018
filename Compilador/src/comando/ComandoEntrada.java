package comando;

import parser.Token;
import semantico.Simbolo;

public class ComandoEntrada  extends ComandoAltoNivel{
	private Simbolo variavel;
	

	public ComandoEntrada(Token _token, Simbolo variavel) {
		super(_token);
		// TODO Auto-generated constructor stub
		this.variavel = variavel;
	}
	
	/*public ListaComandosPrimitivos geraListaComandosPrimitivos(){
		
	}*/

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.variavel.toString();
	}
	
	
	
	
}
