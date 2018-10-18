package semantico;

import parser.Token;

public class Simbolo
{
	private String nome = null;
	private Token token;
	private TipoDado tipo;
	private int referencia;

	public Simbolo(Token _token, TipoDado _tipo, int _referencia)
	{
		this.nome = _token.image;
		this.token = _token;
		this.tipo = _tipo;
		this.referencia = _referencia;
		
	}

	public Token getToken()
	{
		return this.token;
	}
	public Simbolo(Token _token, TipoDado _tipo)
	{
		this.nome = _token.image;
		this.token = _token;
		this.tipo = _tipo;		
	}	

	public String getLexema()
	{
		return this.nome;
	}

	public TipoDado getTipoDado()
	{
		return this.tipo;
	}

	public int getReferencia()
	{
		return this.referencia;
	}

	public void setReferencia(int _referencia)
	{
		this.referencia = _referencia;
	}
	
	@Override
	public String toString()
	{
		return "Lexema : " + this.getLexema() + " Tipo Dado: " + this.getTipoDado() + " Referencia: "+this.getReferencia();
	}
}