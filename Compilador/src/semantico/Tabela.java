package semantico;

import java.util.HashMap;
import parser.*;

public class Tabela 
{
	private HashMap<String, Simbolo> tabela_simbolos;
	private int marcador;
	
	public Tabela()
	{
		this.tabela_simbolos = new HashMap<String,Simbolo>();
		this.marcador = 1;
	}
	
	public boolean incluir( Simbolo _simb )
	{
		if ( this.tabela_simbolos.containsKey(_simb.getNome()) )
			return false;
		else
		{
			this.tabela_simbolos.put(_simb.getNome(), _simb );
			_simb.setReferencia( this.getMarcador() );
			this.atualizarMarcador( _simb.getTipo() );
			return true;
		}
	}
	
	public void atualizarMarcador( Tipo _tipo )
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
		
		this.setMarcador( this.getMarcador() + incremento );
	}

	public int consultarReferencia( String _chave )
	{
		return ((Simbolo)this.tabela_simbolos.get(_chave)).getReferencia();
	}
	
	public boolean isExiste( String _chave )
	{
		return this.tabela_simbolos.containsKey(_chave);
	}
	
	public int getMarcador() 
	{
		return this.marcador;
	}

	public void setMarcador(int _marcador) 
	{
		this.marcador = _marcador;
	}

	public String toString()
	{
		return this.tabela_simbolos.toString();
	}

	public HashMap<String, Simbolo> getTabela() 
	{
		return this.tabela_simbolos;
	}

	public void setTab(HashMap<String, Simbolo> _tabela_simbolos) 
	{
		this.tabela_simbolos = _tabela_simbolos;
	}
	
	
}