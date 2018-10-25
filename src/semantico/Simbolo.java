package semantico;

import parser.Token;

public class Simbolo {

    private String nome;
    private Token token;
    private TipoDado tipo;
    private int referencia;

    public Simbolo(Token token, TipoDado tipo) {
        this.nome = token.image;
    	this.token = token;
        this.tipo = tipo;
    }
    
    public Simbolo(Token token, TipoDado tipo, int referencia) {
        this.nome = token.image;
    	this.token = token;
        this.tipo = tipo;
        this.referencia = referencia;
    }

    public String getLexema() {
    	return this.token.image;
    }

    public TipoDado getTipo() {
        return this.tipo;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

	public int getReferencia() {
		return referencia;
	}
	

	public String getNome() {
		return nome;
	}

    public String toString() {
        return "\nNome:" + this.getNome() + "\tTipo:" + this.getTipo() + "\tReferencia:" + this.getReferencia();
    }


}