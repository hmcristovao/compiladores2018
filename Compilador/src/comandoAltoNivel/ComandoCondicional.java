package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import semantico.Expressao;

public abstract class ComandoCondicional extends ComandoAltoNivel{
	
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	Expressao expressao;
	
	public ComandoCondicional(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}
	
	@Override
	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
	
	@Override
	public abstract String toString();
	
}
