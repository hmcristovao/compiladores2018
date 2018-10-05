package semantico;

import parser.Token;

public class Operando extends Item {
	TipoElemento tipoElemento;
	TipoDado tipoDado;

	public Operando(Token t,TipoDado tipoD, TipoElemento tipoE) {
		super(t);
		tipoElemento=tipoE;
		tipoDado=tipoD;
	}
	 
	public TipoElemento getTipoElemento() {
		 return tipoElemento;
	 }
	
	public TipoDado getTipoDado() {
		 return tipoDado;
	 }
	 
	public String toString() {
		 return (super.getLexema());
	 }
}
