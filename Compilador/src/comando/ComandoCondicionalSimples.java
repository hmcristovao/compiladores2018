package comando;

import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalSimples extends ComandoCondicional {

	public ComandoCondicionalSimples(Token _token, Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivel) {
		super(_token, expressao, listaComandosAltoNivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getExpressao().toString() + super.getListaComandosAltoNivel().toString();
	}

}
