package semantico;

import parser.Token;

public abstract class Item {
	   private Token token;
	   
	   public Item(Token t) {
	      this.token=t;
	   }
	   
	   public String getLexema() {
	      return this.token.image;
	   }
	   public abstract String toString();
}
