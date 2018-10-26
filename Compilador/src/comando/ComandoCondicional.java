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
	
	
	public Expressao getExpressao() 
	{
		return this.expressao;
	}


	public ListaComandosAltoNivel getListaComandosAltoNivelTrue() 
	{
		return this.listaComandosAltoNivelTrue;
	}


}
