package comando;
import parser.*;
import semantico.*;
import geradorCodigo.*;

public class ComandoEnquanto extends ComandoAltoNivel
{
	private Expressao expressao;
	private ListaComandosAltoNivel listaComandosAltoNivelTrue;

	public ComandoEnquanto(Token _token, Expressao _expressao, ListaComandosAltoNivel _listaTrue)
	{
		super(_token);
		this.expressao = _expressao;
		this.listaComandosAltoNivelTrue = _listaTrue;
	}

/*	public ListaComandosPrimitivos geraListaComandosPrimitivos()
	{

	}*/

	@Override
	public String toString()
	{
		return this.getLexema()+" "+this.getExpressao()+" "+this.getListaComandosAltoNivelTrue();
	}

	public Expressao getExpressao() {
		return expressao;
	}

	public ListaComandosAltoNivel getListaComandosAltoNivelTrue() {
		return listaComandosAltoNivelTrue;
	}
}