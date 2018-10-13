package semantico;

import parser.Token;

public class Operando extends Item {
	private TipoDado tipoDado;
	private TipoElemento tipoElemento;
	
	public Operando(Token t, TipoDado tipoDado, TipoElemento tipoElemento ) {
		super(t);
		// TODO Auto-generated constructor stub
		this.tipoDado = tipoDado;
		this.tipoElemento = tipoElemento;
	}
	
	public TipoDado getTipoDado() {
		return this.tipoDado;
	}
	public TipoElemento getTipoElemento() {
		return this.tipoElemento;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getLexema();
	}
}
