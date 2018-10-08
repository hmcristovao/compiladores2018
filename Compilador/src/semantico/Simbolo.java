package semantico;

import parser.Token;

public class Simbolo {
	
	private String nome;      // nome do identificador
	
	private TipoDado tipo;        // representa os tipos usados na linguagem

	private int referencia;   //referência usada na geração do código destino
	
	private Token token;

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public TipoDado getTipo() {
		return tipo;
	}


	public void setTipo(TipoDado tipo) {
		this.tipo = tipo;
	}


	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int marcador) {
		this.referencia = marcador;
	}

	
	public String toString() {

	      return "Nome:"+this.getNome() + "\t" + "Tipo:"+this.getTipo()
	             + "\t" + "Referência:"+this.getReferencia() + "\n";

	 }
	 

}
