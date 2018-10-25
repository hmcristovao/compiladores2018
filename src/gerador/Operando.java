package gerador;

import parser.Token;
import semantico.TipoDado;

public class Operando extends Item {

    private TipoDado tipoDado;
    private TipoElemento tipoElemento;

    public Operando(Token token, TipoDado tipoDado, TipoElemento tipoElemento) {
        super(token);
        this.tipoDado = tipoDado;
        this.tipoElemento = tipoElemento;
    }

   
    public String toString() {
    	return this.token.image;
    }

    public TipoElemento getTipoElemento() {
        return tipoElemento;
    }


    public TipoDado getTipoDado() {
        return tipoDado;
    }


}
