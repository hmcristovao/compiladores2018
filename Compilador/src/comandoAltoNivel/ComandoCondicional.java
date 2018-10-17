package comandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import semantico.*;

public abstract class ComandoCondicional extends ComandoAltoNivel {
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	Expressao exp;
	
	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
	
	public abstract String toString();
}
