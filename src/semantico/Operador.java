package semantico;

import parser.Token;

public class Operador extends Item {

    private TipoOperador tipoOperador;

    public Operador(Token token, TipoOperador tipoOperador) {
        super(token);
        this.tipoOperador = tipoOperador;
    }

    @Override
    public String toString() {
        return /* this.tipoOperador + */this.token.image;
    }

    public TipoOperador getTipoOperador() {
        return tipoOperador;
    }

    public void setTipoOperador(TipoOperador tipoOperador) {
        this.tipoOperador = tipoOperador;
    }

}
