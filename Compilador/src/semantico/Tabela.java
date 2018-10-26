package semantico;

import parser.*;
import tratamentoErro.ErroSemantico;

import java.util.HashMap;
import java.util.Map.Entry;

public class Tabela
{

	private HashMap<String,Simbolo> tabela;
	private int proximaReferencia;

	public Tabela()
	{
		this.tabela = new HashMap<String,Simbolo>();
		this.proximaReferencia = 1;
	}	

	public void incluiSimbolo(Simbolo _simbolo)
	{
		_simbolo.setReferencia(this.getProximaReferencia());
		this.tabela.put(_simbolo.getLexema(), _simbolo);
		this.setProximaReferencia( this.getProximaReferencia() + this.incrementoReferencia(_simbolo.getTipoDado()) );
	}

	public HashMap<String, Simbolo> getTabela()
	{
		return this.tabela;
	}
	
	public int incrementoReferencia(TipoDado _tipo)
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
		
		return incremento;		
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

	public void declaracaoPrevia(Token _token)
	{
		if(!this.verificaExistenciaSimbolo(_token.image))
		{
			throw new ErroSemantico("Variavel '"+_token.image+"' nao declarada na linha "+_token.beginLine+"\n");
		}
	}
	
	public void criarVariavel(Token _token, TipoDado _tipo)
    {

	  	if ( this.verificaExistenciaSimbolo( _token.image ) )
	  	{
	  		throw new ErroSemantico("Variavel '" + _token.image + "' repetida na linha " + _token.beginLine + "\n");
	  	}
	  	else
	  	{
			Simbolo simbolo = new Simbolo( _token, _tipo );
	  		this.incluiSimbolo(simbolo);
	  	}
    }

	@Override
	public String toString()
	{
		return this.tabela.toString();
		
	}
}
