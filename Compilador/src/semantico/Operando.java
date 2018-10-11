package semantico;

import parser.Token;

public class Operando extends Item {

	private TipoDado tipoDado;
	private TipoElemento tipoElemento;
	
	public Operando(Token _token, TipoDado _tipoDado, TipoElemento _tipoElemento) {
		   super(_token,_tipoDado,_tipoElemento);
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
		return null;
	}



}
