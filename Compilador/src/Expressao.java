
public class Expressao 
{
//	Expressão no modo infixo
	private String exp_original;
//	Linha na qual a expressão foi descrita
	private long linha;
//	Tipos de dados presentes na expressão
	private Tipo tipo;
	
	public Expressao( String _exp_original, long _linha, Tipo _tipo )
	{
		this.exp_original = _exp_original;
		this.linha = _linha;
		this.tipo = _tipo;
	}
	
	public Expressao( String _exp_original, Tipo _tipo )
	{
		this.exp_original = _exp_original;
		this.linha = 0;
		this.tipo = _tipo;
	}

	public String getExp_original() 
	{
		return this.exp_original;
	}

	public void setExp_original(String _exp_original) 
	{
		this.exp_original = _exp_original;
	}

	public long getLinha() 
	{
		return this.linha;
	}

	public void setLinha(long _linha) 
	{
		this.linha = _linha;
	}

	public Tipo getTipo() 
	{
		return this.tipo;
	}

	public void setTipo(Tipo _tipo) 
	{
		this.tipo = _tipo;
	}
	
}
