package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalComposto extends ComandoCondicional {

	public ComandoCondicionalComposto(Token _token, Expressao _expressao, ListaComandosAltoNivel _listaComandosAltoNivel) {
		super(_token, _expressao, _listaComandosAltoNivel);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivo() {
		// TODO Auto-generated method stub
		return null;
	}

}
