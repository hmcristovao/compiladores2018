package comando;
import geradorCodigo.*;
import parser.*;
import semantico.Simbolo;

public class ComandoSaida extends ComandoAltoNivel
{
	private Expressao expressao;
	
	public ComandoSaida(Token _token, Expressao _expressao)
	{
		super(_token);
		this.expressao = _expressao;
	}

//	public ListaComandosPrimitivos geraListaComandosPrimitivos()
//	{
//		return null;
//	}

	@Override
	public String toString()
	{
		return this.getLexema()+" "+this.getExpressao();
	}

	public Expressao getExpressao() {
		return expressao;
	}
}