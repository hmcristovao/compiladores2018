package semantico;

import parser.Token;

public abstract class Item {

	public Token token;
	
	public Item(Token token) {
		this.token = token;
	}
	
	public abstract String getLexema();
	
	public abstract String toString();
	
}
