package comando;
import parser.*;
import geradorCodigo.*;

public class ComandoCondicionalComposto extends ComandoCondicional
{
	private ListaComandosAltoNivel listaComandosAltoNivelFalse;

	public ComandoCondicionalComposto(Expressao _exp, Token _token,ListaComandosAltoNivel _blocoComandosTrue, ListaComandosAltoNivel _blocoComandosFalse)
	{
		super(_exp, _token, _blocoComandosTrue );
		this.listaComandosAltoNivelFalse = _blocoComandosFalse;
	}

	/*public ListaComandosPrimitivos geraListaComandosPrimitivos()
	{

	}*/
		
	@Override
	public String toString()
	{
		return "<" + this.getLexema() + ", " + this.getExpressao() + ", " + this.getListaComandosAltoNivelTrue() + ", " + this.getListaComandosAltoNivelFalse() + ">";
	}

	public ListaComandosAltoNivel getListaComandosAltoNivelFalse()
	{
		return this.listaComandosAltoNivelFalse;
	}
	
	public void setListaComandosAltoNivelFalse(ListaComandosAltoNivel _listaComandosAltoNivelFalse) 
	{
		this.listaComandosAltoNivelFalse = _listaComandosAltoNivelFalse;
	}
}