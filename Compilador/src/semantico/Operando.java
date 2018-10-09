package semantico;

import parser.Token;

public class Operando extends Item {
	TipoDado tipoDado;
	TipoElemento tipoElemento;
	
	
	public TipoDado getTipoDado() {
		return tipoDado;
	}
	
	public TipoElemento getTipoElemento() {
		return tipoElemento;
	}
	
	public Operando(Token t, TipoDado tipoDado){
		super(t);
		this.tipoDado = tipoDado;	
	}
	 public String toString() {
		 return null;
	 }

	public void setTipoDado(TipoDado tipoDado) {
		this.tipoDado = tipoDado;
	}

	public void setTipoElemento(TipoElemento tipoElemento) {
		this.tipoElemento = tipoElemento;
	}
	
	
	

}
