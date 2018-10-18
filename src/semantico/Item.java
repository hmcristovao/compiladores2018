package semantico;
import parser.*;



public abstract class Item {

	Token token;

public Item(Token token) {this.token=token;}
	
public String getLexema() {
		return token.image;	
	}
	public abstract String toString();
}
