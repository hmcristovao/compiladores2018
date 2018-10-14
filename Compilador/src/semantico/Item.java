package semantico;

import parser.Token;

public abstract class Item
{
	// Adicionar tipo e fazer o construtor disso aqui
	private Token token;

	public Item(Token _token)
	{
		this.token = _token;
	}
	public String getLexema() {
		return this.token.image;
	}

	@Override
	public abstract String toString();
}