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
		String expDestinoAssembler = "";
		
		PrimitivoAtribuicao comandoPrimitivo = new PrimitivoAtribuicao(referencia,tipo,expDestinoAssembler);
		ListaComandosPrimitivos listaAtribuicao = new ListaComandosPrimitivos();
		listaAtribuicao.addComando(comandoPrimitivo);
		
		return listaAtribuicao;
	}

	@Override
	public String toString()
	{
		return "<" + this.getLexema() + "," + variavel.getLexema() + "," + expressao.getExpressaoPosfixa() + ">";
	}
}