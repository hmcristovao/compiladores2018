package primeiraPassagem;

import parser.Token;
import segundaPassagem.*;

public abstract class ComandoAltoNivel {
	private Token token;

	public ComandoAltoNivel(Token _token) {
		this.token=_token;
	}
	
   public String getLexema() {
	      return this.token.image;
   }
   
   public abstract String toString();
   
   public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
}
