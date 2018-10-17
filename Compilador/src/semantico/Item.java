package semantico;
import parser.*;

//import jdk.nashorn.internal.parser.Token;

public abstract class Item {

	Token token;
	
	public String getLexema() {
		return token.toString();	
	}
	public abstract String toString();
}
