package semantico;

import parser.Token;

public class Operador extends Item {
	TipoOperador tipoOperador;
	
	public Operador(Token _token, TipoOperador _operador) {
		super(_token,_operador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
