package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalSimples extends ComandoCondicional{
	
	public ComandoCondicionalSimples(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		super(expressao, listaComandosAltoNivelTrue);
		this.token = token;
	}
	
	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String toString() {
		return this.getLexama() + " " + this.expressao.getListaExpPosFixa()  + "\n" +  listaComandosAltoNivelTrue.toString() + "\n";
	}

	
}
