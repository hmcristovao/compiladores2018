package semantico;

import parser.Token;

public class Operador extends Item {

	public TipoOperador tipoOperador;
	public String valor;
	public Operador(Token t,TipoOperador tipoOperador, String valor) {
	super(t);
	this.tipoOperador=tipoOperador;
	this.valor=valor;}
	
	public TipoOperador getTipoOperador() {
		return this.tipoOperador;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tipoOperador.toString();
	}

}
