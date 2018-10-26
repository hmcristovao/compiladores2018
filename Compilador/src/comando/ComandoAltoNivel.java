package comando;

import parser.Token;

public abstract class ComandoAltoNivel
{
	private Token token;

	public ComandoAltoNivel(Token _token)
	{
		this.token = _token;
	}
	
	public String getLexema()
	{
		return token.image;
	}
	
	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();

	@Override
	abstract public String toString();
}