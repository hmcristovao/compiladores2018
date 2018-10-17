package comando;
import geradorCodigo.*;
import parser.*;
import semantico.Simbolo;
import semantico.TipoDado;

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

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//Expressao expDestAssemb = this.expressao;
		//TipoDado tipo = this.variavel.getTipoDado();
		//PrimitivoSaida comandoPrimitivo = new PrimitivoSaida("expDestAssemb",tipo);
		ListaComandosPrimitivos listaAtribuicao = new ListaComandosPrimitivos();
		//listaAtribuicao.addComando(comandoPrimitivo);
		return listaAtribuicao;
	}
}