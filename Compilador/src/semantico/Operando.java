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
	
	public Operando(Token t, TipoDado tipoDado, TipoElemento tipoElemento){
		super(t);
		this.tipoDado = tipoDado;
		this.tipoElemento = tipoElemento;
	}
	 public String toString() {
		 return "Operando: "+this.token.image+" TipoDado: "+this.tipoDado+" TipoElemento: "+this.tipoElemento+"\n";
	 }

	public void setTipoDado(TipoDado tipoDado) {
		this.tipoDado = tipoDado;
	}

	public void setTipoElemento(TipoElemento tipoElemento) {
		this.tipoElemento = tipoElemento;
	}
	
	
	

}
