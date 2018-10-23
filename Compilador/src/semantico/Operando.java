package semantico;
import parser.*;

public class Operando extends Item {
	TipoDado tipoDado;
	TipoElemento tipoElemento;
	
	public Operando(TipoDado tipoDado, TipoElemento tipoElemento, Token token) {
	  super(token);
	  this.tipoDado = tipoDado;
	  this.tipoElemento = tipoElemento;
	}
	
   public String getLexema() {
	      return "Operando";
   }
   
   public TipoDado getTipoDado() {
	      return this.tipoDado;
   }
	
   public TipoElemento getTipoElemento() {
	      return this.tipoElemento;
   }
   
   public String toString() {
	   return this.tipoDado+ "," + this.tipoElemento + "-" + this.token;
   }
	
}
