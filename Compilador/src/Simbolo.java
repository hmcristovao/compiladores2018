
public class Simbolo 
{
	// Identificador da variável
	private String nome;	
	// Tipos usados na linguagem
	private Tipo tipo;
	// Referência utilizada na geração de código destino	
	private int referencia;
	// Armazena última referência incluída na tabela
	private static int marcador = 1; 
	
	public Simbolo( String nome )
	{
		this.nome = nome;
		this.referencia = Simbolo.marcador;
		this.tipo = Tipo.NUMERO;
		atualizarMarcador( Tipo.NUMERO );
	}
	
	public Simbolo( String _nome, Tipo _tipo )
	{
		this.nome = _nome;
		this.referencia = Simbolo.marcador;
		this.tipo = _tipo;
		atualizarMarcador( _tipo );
	}

	public static int atualizarMarcador( Tipo _tipo )
	{
		int incremento;
		switch ( _tipo )
		{
			case NUMERO:
				incremento = 2;
				break;
			case PALAVRA:
				incremento = 1;
				break;
			default:
				incremento = 0;
		}
		
		Simbolo.marcador += incremento;
		
		return incremento;
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

	public static int getMarcador() 
	{
		return marcador;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public void setReferencia(Tipo _tipo) 
	{
		this.referencia = Simbolo.marcador;
	}

	public static void setMarcador(int marcador) 
	{
		Simbolo.marcador = marcador;
	}

	public Tipo getTipo() 
	{
		return this.tipo;
	}

	public void setTipo(Tipo tipo) 
	{
		this.tipo = tipo;
	}
	
	public String toString()
	{
		return "{ NOME: " + this.getNome() + " / " + "REFERÊNCIA: " + this.getReferencia() + "}\n";
	}
	
	
}
