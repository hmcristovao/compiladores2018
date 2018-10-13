package semantico;

import parser.Token;

public class Operador extends Item {
	private TipoOperador tipoOperador;
	
	public Operador(Token t, TipoOperador tipoOperador){
		super(t);
		this.tipoOperador = tipoOperador;
	}

	public TipoOperador getTipoOperador() {
		return this.tipoOperador;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.getLexema());
	}

	
}
