package semantico;

import parser.Token;

public class Operando extends Item {
	private Token sinal;
	private TipoDado tipoDado;
	private TipoElemento tipoElemento;
	
	public Operando( Token _token, Token _sinal, TipoDado _tipoDado, TipoElemento _tipoElemento) {
		  super(_token,_tipoDado,_tipoElemento);
		  this.tipoDado = tipoDado;
		  this.tipoElemento = tipoElemento;
		  this.sinal = _sinal;
		}
	
	public Operando(Token _token, TipoDado _tipoDado, TipoElemento _tipoElemento) {
		   super(_token,_tipoDado,_tipoElemento);
		   this.tipoDado = _tipoDado;
		   this.tipoElemento = _tipoElemento;
		   this.sinal = null;
		}
	
	public String getTipo() {
		return "Operando";
	}

	public TipoDado getTipoDado() {
		return tipoDado;
	}

	public TipoElemento getTipoElemento() {
		return tipoElemento;
	}
	
	public String getLexema() {
		if (sinal != null) return sinal.image + token.image;
		return token.image;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return token.image;
	}



}
