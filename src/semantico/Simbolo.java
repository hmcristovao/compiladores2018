package semantico;

import parser.Token;

public class Simbolo {

    private String nome;
    private Token token;
    private TipoDado tipo;
    private int referencia;

    public Simbolo(Token token, TipoDado tipo, int referencia) {
        this.nome = token.image;
    	this.token = token;
        this.tipo = tipo;
        this.referencia = referencia;
    }
    
    public Simbolo(String _nome, Token token, TipoDado tipo, int referencia) {
        this.nome = _nome;
    	this.token = token;
        this.tipo = tipo;
        this.referencia = referencia;
    }

    public String getLexema() {
        return null;
    }

    public String getNome() {
        return this.nome;
    }

    public int getReferencia() {
        return this.referencia;
    }

    public TipoDado getTipo() {
        return this.tipo;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {

        return "\nNome:" + this.getNome() + "\tToken: " + this.token.image 
        	 + "\tTipo:" + this.getTipo() + "\tReferência:" + this.getReferencia();
    }

    public void setTipo(TipoDado tipo) {
        this.tipo = tipo;
    }

}
