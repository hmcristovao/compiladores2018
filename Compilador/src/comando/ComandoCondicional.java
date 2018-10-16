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

	public Expressao getExpressao() 
	{
		return this.expressao;
	}

	public ListaComandosAltoNivel getListaComandosAltoNivelTrue() 
	{
		return this.listaComandosAltoNivelTrue;
	}

	public void setExpressao(Expressao _expressao) 
	{
		this.expressao = _expressao;
	}


	public void setListaComandosAltoNivelTrue(ListaComandosAltoNivel _listaComandosAltoNivelTrue) 
	{
		this.listaComandosAltoNivelTrue = _listaComandosAltoNivelTrue;
	}


	public abstract String toString();
	
}
