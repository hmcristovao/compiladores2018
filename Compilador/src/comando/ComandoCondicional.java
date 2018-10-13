package comando;

import geradorCodigo.Expressao;
import parser.Token;

public abstract class ComandoCondicional extends ComandoAltoNivel {
	
	private Expressao expressao;
	private ListaComandosAltoNivel listaComandosAltoNivel;
	
	public ComandoCondicional(Token _token, Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivel) {
		super(_token);
		// TODO Auto-generated constructor stub
		this.setExpressao(expressao);
		this.setListaComandosAltoNivel(listaComandosAltoNivel);
	}
	
	//public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
	
	public abstract String toString();

	public Expressao getExpressao() {
		return expressao;
	}

	public void setExpressao(Expressao expressao) {
		this.expressao = expressao;
	}

	public ListaComandosAltoNivel getListaComandosAltoNivel() {
		return listaComandosAltoNivel;
	}

	public void setListaComandosAltoNivel(ListaComandosAltoNivel listaComandosAltoNivel) {
		this.listaComandosAltoNivel = listaComandosAltoNivel;
	}
	

}
