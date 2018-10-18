package comando;
import parser.*;
import semantico.*;

public class ComandoEntrada extends ComandoAltoNivel
{
	private Simbolo variavel;

	public ComandoEntrada(Token _token, Simbolo _variavel)
	{
		super(_token);
		this.variavel = _variavel;
	}



	@Override
	public String toString()
	{
		return "<" + this.getLexema() + ", " + variavel.getLexema() + ">" ;
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() 
	{
		int referencia = this.variavel.getReferencia();
		TipoDado tipo = this.variavel.getTipoDado();
		PrimitivoEntrada comandoPrimitivo = new PrimitivoEntrada(referencia,tipo);
		ListaComandosPrimitivos listaAtribuicao = new ListaComandosPrimitivos();
		listaAtribuicao.addComando(comandoPrimitivo);
		
		return listaAtribuicao;
	}
}