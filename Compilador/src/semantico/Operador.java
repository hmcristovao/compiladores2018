package semantico;

import parser.Token;

public class Operador extends Item{
	TipoOperador tipoOperador;

	public TipoOperador getTipoOperador() {
		return tipoOperador;
	}
	
	public Operador(Token t, TipoOperador tipoOperador) {
		super(t);
		this.tipoOperador = tipoOperador;
		
	}
	
	public String toString() {
		return null;
	}

}
