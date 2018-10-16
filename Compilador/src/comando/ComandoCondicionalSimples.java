package comando;
import parser.*;
import semantico.*;
import geradorCodigo.*;

public class ComandoCondicionalSimples extends ComandoCondicional
{

	public ComandoCondicionalSimples(Token _token, Expressao _exp, ListaComandosAltoNivel _listaTrue)
	{
		super(_exp, _token, _listaTrue);
	}

/*	public ListaComandosPrimitivos geraListaComandosPrimitivos()
	{

	}*/
	
	
	
	@Override
	public String toString()
	{
		return "<" + this.getLexema() + ", " + this.getExpressao() + ", " + this.getListaComandosAltoNivelTrue() + ">";
	}


}