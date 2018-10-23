package semantico;
import parser.*;
public abstract class Item {

	public Token token;
	
	public Item(Token token) {
		this.token = token;
	}
	
	public abstract String getLexema();
	
	public abstract String toString();
	
}