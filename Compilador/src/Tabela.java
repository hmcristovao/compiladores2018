
import java.util.HashMap;

public class Tabela 
{
	private HashMap<String, Simbolo> tab;
	private int marcador;
	
	public Tabela()
	{
		this.tab = new HashMap<String,Simbolo>();
		this.marcador = 1;
	}
	
	public boolean incluir( Simbolo _simb )
	{
		if ( this.tab.containsKey(_simb.getNome()) )
			return false;
		else
		{
			this.tab.put(_simb.getNome(), _simb );
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
		
		this.marcador += incremento;
	}
	
	public void declaracaoPrevia( Token t )
	   {
	     	if ( !this.isExiste( t.image ) )
			{
				System.out.println("erro: variável " + t.image + " não declarada na linha " + t.beginLine + "\n");
			}
	   }

    public void criarVariavel( Token t, char _c_tp )
    {
		Simbolo simb = null;
		switch ( _c_tp )
		{
			case 'N':
				simb = new Simbolo( t.image );
				break;
			case 'S':
				simb = new Simbolo( t.image, Tipo.PALAVRA );
				break;
		}

	  	if ( !this.incluir( simb ) )
	  	{
			System.out.println("erro: variável " + t.image + " repetida na linha " + t.beginLine + "\n");
	  	}
	 
    }  
	   
	public int consultarReferencia( String _chave )
	{
		return ((Simbolo)this.tab.get(_chave)).getReferencia();
	}
	
	public boolean isExiste( String _chave )
	{
		return this.tab.containsKey(_chave);
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
		return this.tab.toString();
	}
}