

public class Simbolo 
{
	// Identificador da variável
	private String nome;	
	// Tipos usados na linguagem
	private Tipo tipo;
	// Referência utilizada na geração de código destino	
	private int referencia;
	
	public Simbolo( String _nome )
	{
		this.nome = _nome;
		this.tipo = Tipo.NUMERO;
	}
	
	public Simbolo( String _nome, Tipo _tipo )
	{
		this.nome = _nome;
		this.tipo = _tipo;
	}
	
	// Getters and Setters and ToString()
	public String getNome() 
	{
		return this.nome;
	}

	public int getReferencia() 
	{
		return this.referencia;
	}

	public void setNome(String _nome) 
	{
		this.nome = _nome;
	}

	public void setReferencia( int _referencia ) 
	{
		this.referencia = _referencia ;
	}

	public Tipo getTipo() 
	{
		return this.tipo;
	}

	public void setTipo(Tipo _tipo) 
	{
		this.tipo = _tipo;
	}
	
	public String toString()
	{
		return "{ NOME: " + this.getNome() + " / " + "REFERÊNCIA: " + this.getReferencia() + "}\n";
	}
	
	
}