package comando;
import parser.*;
import semantico.*;
import geradorCodigo.*;

public abstract class ComandoCondicional extends ComandoAltoNivel
{
	private Expressao expressao;
	private ListaComandosAltoNivel listaComandosAltoNivelTrue;

	public ComandoCondicional(Expressao _exp, Token _token, ListaComandosAltoNivel _lista)
	{
		super(_token);
		this.listaComandosAltoNivelTrue = _lista;
		this.expressao = _exp;
	}
	
	
/*	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos()
	{

	}	*/

	public Expressao getExpressao() {
		return expressao;
	}


	public ListaComandosAltoNivel getListaComandosAltoNivelTrue() {
		return listaComandosAltoNivelTrue;
	}


	public abstract String toString();
}
