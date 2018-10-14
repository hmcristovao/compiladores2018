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

/*	public ListaComandosPrimitivos 
			geraListaComandosPrimitivos()
	{

	}*/

	@Override
	public String toString()
	{
		return this.getLexema()+variavel.getLexema();
	}
}