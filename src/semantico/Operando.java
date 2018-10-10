package semantico;

import parser.Token;

public class Operando extends Item {

    private TipoDado tipoDado;
    private TipoElemento tipoElemento;

    public Operando(Token token, TipoDado tipoDado, TipoElemento tipoElemento) {
        super(token);
        this.tipoDado = tipoDado;
        this.tipoElemento = tipoElemento;
    }

    @Override
    public String toString() {
        return /*this.tipoDado + " " + this.tipoElemento*/ this.token.image;
    }

    public TipoElemento getTipoElemento() {
        return tipoElemento;
    }

    public void setTipoElemento(TipoElemento tipoElemento) {
        this.tipoElemento = tipoElemento;
    }

    public TipoDado getTipoDado() {
        return tipoDado;
    }

    public void setTipoDado(TipoDado tipoDado) {
        this.tipoDado = tipoDado;
    }

}
