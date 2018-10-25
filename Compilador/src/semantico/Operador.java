package semantico;

import parser.Token;

public class Operador extends Item {
	Token token;
	TipoOperador tipoOperador;
	
	public Operador(Token _token, TipoOperador _operador) {
		super(_token,_operador);
		this.token = _token;
		   this.token = _token;
		   this.tipoOperador = _operador;
		// TODO Auto-generated constructor stub
	}
	
	public String getTipo() {
		return "Operador";
	}
	public String getLexema() {
		return token.image;
	}
	public TipoOperador getTipoOperador() {
		return tipoOperador;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return token.image;
	}

}
