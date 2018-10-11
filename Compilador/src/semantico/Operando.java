package semantico;

import parser.Token;

public class Operando extends Item {
	private Token token;
	private TipoDado tipoDado;
	private TipoElemento tipoElemento;
	
	public Operando(Token _token, TipoDado _tipoDado, TipoElemento _tipoElemento) {
		   super(_token,_tipoDado,_tipoElemento);
		   this.token = _token;
		   this.tipoDado = _tipoDado;
		   this.tipoElemento = _tipoElemento;
		}

	TipoDado getTipoDado() {
		return tipoDado;
	}

	TipoElemento get_tipoElemento() {
		return tipoElemento;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return token.image;
	}



}
