package semantico;

import parser.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class Tabela
{

	private HashMap<String,Simbolo> tabela;
	private int proximaReferencia;

	public Tabela()
	{
		this.tabela = new HashMap<String,Simbolo>();
		//TODO : verificar se ao iniciar uma tabela a referencia inicia como zero ou 1
		this.proximaReferencia = 1;
	}	

	public void incluiSimbolo(Simbolo _simbolo)
	{
		_simbolo.setReferencia(this.proximaReferencia);
		this.tabela.put(_simbolo.getLexema(), _simbolo);
		this.incrementaReferencia(_simbolo.getTipoDado());
		//System.out.println(_simbolo.getLexema()+_simbolo.getReferencia()+_simbolo.getTipoDado());
	}

	public HashMap<String, Simbolo> getTabela()
	{
		return this.tabela;
	}
	public void showTabela()
	{
		HashMap<String, Simbolo> tab = this.getTabela();
		for(Simbolo i : tab.values() )
		{
			System.out.println("Lexema :"+i.getLexema()+" Tipo Dado: "+i.getTipoDado()+" Referencia: "+i.getReferencia());
		}
	}
	
	public void incrementaReferencia(TipoDado _tipo)
	{
		int incremento;
		switch (_tipo)
		{
			case NUM:
				incremento = 2;
				break;
			case STR:
				incremento = 1;
				break;
			default:
				incremento = 0;
		}
		
		this.setProximaReferencia(this.getProximaReferencia() + incremento);		
	}

	public void setProximaReferencia(int _referencia)
	{
		this.proximaReferencia = _referencia;
	}

	public boolean verificaExistenciaSimbolo(String _lexema)
	{
		return this.tabela.containsKey( _lexema );
	}

	public Simbolo consultaSimbolo(String _chave)
	{
		return ((Simbolo)this.tabela.get(_chave));
	}

	public int consultaReferencia(String _chave)
	{
		return ((Simbolo)this.tabela.get(_chave)).getReferencia();
	}

	public TipoDado consultaTipo(String _chave)
	{
		return ((Simbolo)this.tabela.get(_chave)).getTipoDado();		
	}

	public int getProximaReferencia()
	{
		return this.proximaReferencia;
	}

	@Override
	public String toString()
	{
		return this.tabela.toString();
		
	}
}
