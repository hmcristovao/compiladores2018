package primeiraPassagem;

import parser.Token;

public abstract class ComandoAltoNivel {
	Token token;
	
   public String getLexema() {
	      return this.token.image;
   }
   
   public abstract String toString();
}
