package comando;

import geradorCodigo.Expressao;
import parser.Token;

public class ComandoEnquanto extends ComandoAltoNivel {
	private Expressao expressao;
	private ListaComandosAltoNivel listaComandosAltoNivel;
	
	public ComandoEnquanto(Token _token, Expressao _expressao, ListaComandosAltoNivel _listaComandosAltoNivel) {
		super(_token);
		this.expressao = _expressao;
		this.listaComandosAltoNivel = _listaComandosAltoNivel; 
	}
	
	/*public ListaComandosPrimitivos geraListaComandosPrimitivos(){
		
	}*/

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.expressao.toString() + this.listaComandosAltoNivel.toString();
	}

}
