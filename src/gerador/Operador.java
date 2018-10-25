package gerador;

import parser.Token;


public class Operador extends Item {

    private TipoOperador tipoOperador;

    public Operador(Token token, TipoOperador tipoOperador) {
        super(token);
        this.tipoOperador = tipoOperador;
    }

    
    public String toString() {
    	return this.token.image;
    }

    public TipoOperador getTipoOperador() {
        return tipoOperador;
    }

}
