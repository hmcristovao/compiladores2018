
public class Item 
{
	private Enum<?> tipo;
	private String descricao;
	
	public Item( String _descricao )
	{
		this.tipo = null;
		this.descricao = _descricao;
	}
	
	public Item( String _descricao, Enum<?> _tipo )
	{
		this.tipo = _tipo;
		this.descricao = _descricao;
	}
	
	public Enum<?> getTipo() 
	{
		return this.tipo;
	}
	
	public void setTipo(Tipo _tipo) 
	{
		this.tipo = _tipo;
	}
	
	public String getDescricao() 
	{
		return descricao;
	}
	
	public void setDescricao(String _descricao) 
	{
		this.descricao = _descricao;
	}
	
	@Override
	public String toString() 
	{
		return "(" + this.getDescricao() + ";" +  this.getTipo() + ")";
	}
}
