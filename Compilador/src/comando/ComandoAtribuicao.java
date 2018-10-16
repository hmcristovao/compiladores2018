package comando;

import geradorCodigo.*;
import semantico.*;

public class ComandoAtribuicao extends ComandoAltoNivel
{
	private Simbolo variavel;
	private Expressao expressao;

	public ComandoAtribuicao(Simbolo _variavel, Expressao _expressao)
	{
		super(_variavel.getToken());
		this.variavel = _variavel;
		this.expressao = _expressao;
		
	}

/*	public ListaComandosPrimitivos geraListaComandosPrimitivos()
	{

	}*/	

	@Override
	public String toString()
	{
		return "<" + this.getLexema() + ", " + variavel.getLexema() + ": Expressao_POS: " + expressao.getExpressaoPosfixa() + ">";
	}
}