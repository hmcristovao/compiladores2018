package comandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;
import semantico.*;

public abstract class ComandoCondicional extends ComandoAltoNivel {
	
	private Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	public ComandoCondicional(Expressao _exp, Token _token, ListaComandosAltoNivel _lista)
	{
		super(_token);
		this.listaComandosAltoNivelTrue = _lista;
		this.expressao = _exp;
}
	
	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
	
	public abstract String toString();
}
