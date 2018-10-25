package semantico;

import parser.Token;

public abstract class Item {
	public Token token;
		
	public Item(Token _token, TipoOperador _operador) {
		   this.token = _token;
		}
	
	public Item(Token _token, TipoDado _tipoDado, TipoElemento _tipoElemento) {
		   this.token = _token;
		}

	public abstract String getTipo();
	public abstract String getLexema();

	public abstract String toString();
}