package semantico;

import parser.Token;

public class Operador extends Item{
	TipoOperador tipoOperador;
	
	public Operador(TipoOperador tipoOperador, Token token) {
	      super(token);
	      this.tipoOperador = tipoOperador;
		}
		
   public TipoOperador getTipoOperador() {
	     return this.tipoOperador;
   }
   
   public String toString() {
	   return this.tipoOperador+ "-" + this.token;
   }
	
}


