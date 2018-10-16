package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;

public class ComandoCondicionalSimples extends ComandoCondicional{

	public ComandoCondicionalSimples(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		super(expressao, listaComandosAltoNivelTrue);
	}

	public String toString() {
		return "Condicional Simples " + this.expressao.getListaExpPosFixa() +"\n";
	}

	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}
}
