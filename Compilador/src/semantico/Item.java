package semantico;

import parser.Token;

public abstract class Item {
	private Token token;
		
	public Item(Token _token, TipoOperador _operador) {
		   this.token = _token;
		}
	
	public Item(Token _token, TipoDado _tipoDado, TipoElemento _tipoElemento) {
		   this.token = _token;
		}

	public String getLexema() {
			return this.token.image;
		}

	public abstract String toString();
}