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

	public ListaComandosPrimitivos geraListaComandosPrimitivos()
	{
		int referencia = this.variavel.getReferencia();
		TipoDado tipo = this.variavel.getTipoDado();
		
		PrimitivoAtribuicao comandoPrimitivo = new PrimitivoAtribuicao(referencia, tipo, this.getExpressao().geraCodigoDestino());
		ListaComandosPrimitivos listaAtribuicao = new ListaComandosPrimitivos();
		listaAtribuicao.addComando(comandoPrimitivo);
		
		return listaAtribuicao;
	}
	
	public Expressao getExpressao() 
	{
		return this.expressao;
	}

	public void setExpressao(Expressao _expressao) 
	{
		this.expressao = _expressao;
	}

	@Override
	public String toString()
	{
		return "<atrib," + variavel.getLexema() + "," + expressao.getExpressaoPosfixa() + ">\n";
	}
}