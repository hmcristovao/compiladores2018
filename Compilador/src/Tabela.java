
import java.util.HashMap;

public class Tabela 
{
	private HashMap<String, Simbolo> tab;
	
	public Tabela()
	{
		this.tab = new HashMap<String,Simbolo>();
	}
	
	public boolean incluir( Simbolo _simb )
	{
		if ( this.tab.containsKey(_simb.getNome()) )
			return false;
		else
		{
			this.tab.put(_simb.getNome(), _simb );
			return true;
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
	
	public String toString()
	{
		return this.tab.toString();
	}
	
	public void declaracaoPrevia( Token t )
    {
     	if ( !this.isExiste( t.image ) )
		{
			System.out.println("erro: variável " + t.image + " não declarada na linha " + t.beginLine + "\n");
		}
    }
	
	public void alocarVariavel( Token t, char _c_tp )
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
	
}
