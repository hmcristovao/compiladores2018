package semantico;

import parser.Token;

public class Simbolo {
	
	private String nome;      // nome do identificador
	private TipoDado tipo;    // representa os tipos usados na linguagem
	private int referencia;   //referencia usada na geracao do codigo destino
	private Token token;
	private boolean isInicializada;  // atributo para cuidar do erro semantico: falta de inicializacao de vriavel
	
	public Simbolo(Token token, TipoDado tipo) {
		this.token = token;
		this.tipo = tipo;
		this.nome = token.image;
		this.isInicializada = false;
	}
	
	public Simbolo(Token token, TipoDado tipo, int referencia) {
		this.token = token;
		this.tipo = tipo;
		this.referencia = referencia;
		this.nome = token.image;
		this.isInicializada = false;	
	}

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
	             + "\t" + "Referencia:"+this.getReferencia() + "\n";	      
	 }

	public boolean getIsInicializada() {
		return isInicializada;
	}

	public void setIsInicializada(boolean status) {
		this.isInicializada = status;
	}
}
