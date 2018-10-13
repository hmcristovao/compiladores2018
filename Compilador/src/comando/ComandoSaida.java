package comando;

import geradorCodigo.Expressao;
import parser.Token;

public class ComandoSaida extends ComandoAltoNivel{

	private Expressao expressao;
	
	public ComandoSaida(Token _token, Expressao _expressao) {
		super(_token);
		this.expressao = _expressao;
	}
	
	/*public ListaComandosPrimitivos geraListaComandosPrimitivos(){
		
	}*/

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getLexema() + this.expressao.toString();
	}
	
}
