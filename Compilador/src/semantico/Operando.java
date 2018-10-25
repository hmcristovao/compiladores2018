package semantico;

import parser.Token;

public class Operando extends Item {
	
	TipoDado tipoDado;
	TipoElemento tipoElemento;
	Token sinal;
	
	public Operando(TipoDado tipoDado, TipoElemento tipoElemento, Token token) {
	  super(token);
	  this.tipoDado = tipoDado;
	  this.tipoElemento = tipoElemento;
	  this.sinal = null;
	}
	
	public Operando(TipoDado tipoDado, TipoElemento tipoElemento, Token token, Token sinal) {
		  super(token);
		  this.tipoDado = tipoDado;
		  this.tipoElemento = tipoElemento;
		  this.sinal = sinal;
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
   
   public String getValor() {
	   
	   if(sinal != null )
		   return sinal.image + token.image;
	   
	   return token.image;
	   
   }

@Override
public String toString() {
	return getValor() + "(" + this.tipoDado +") ";
}
}
