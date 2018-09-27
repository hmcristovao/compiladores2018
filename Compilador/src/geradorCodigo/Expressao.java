package geradorCodigo;
import java.util.LinkedList;

import semantico.*;

public class Expressao 
{
//	Expressão no modo infixo
	private String expInfixo;
//	Linha na qual a listaressão foi descrita
	private long linha;
//	Tipos de dados presentes na listaressão
	private Tipo tipo;
	private LinkedList<Item> lista;
	
	public Expressao()
	{
		this.lista = new LinkedList<Item>();
//		this.linha = 0;
	}
	
	
	public Expressao( String _expInfixo, long _linha, Tipo _tipo )
	{
		this.expInfixo = _expInfixo;
		this.linha = _linha;
		this.tipo = _tipo;
	}
	
	public Expressao( String _expInfixo, Tipo _tipo )
	{
		this.expInfixo = _expInfixo;
		this.linha = 0;
		this.tipo = _tipo;
	}

	public String getExp_original() 
	{
		return this.expInfixo;
	}

	public void setExp_original(String _expInfixo) 
	{
		this.expInfixo = _expInfixo;
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

	public LinkedList<Item> getLista() 
	{
		return this.lista;
	}

	public void setLista(LinkedList<Item> _lista) 
	{
		this.lista = _lista;
	}
	
	public void add( Item _item )
	{
		this.getLista().add(_item);
	}
	
	@Override
	public String toString() 
	{
		return this.lista.toString();
	}
	
	
}
