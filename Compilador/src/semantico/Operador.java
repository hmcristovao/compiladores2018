package semantico;

import parser.Token;

public class Operador extends Item {

	TipoOperador tipoOperador;

	public Operador(Token t,TipoOperador tipoO) {
		super(t);
		tipoOperador=tipoO;
	}
	 
	public TipoOperador getTipoOperador() {
		 return tipoOperador;
	 }
	 
	public String toString() {
		 return (super.getLexema());
	 }
	 

}
