
public class AcaoSemantica 
{
	public static void declaracaoPrevia( Tabela _tab, Token _t )
    {
     	if ( !_tab.isExiste( _t.image ) )
		{
			System.out.println("erro: variável " + _t.image + " não declarada na linha " + _t.beginLine + "\n");
		}
    }
	
	public static void criarVariavel( Tabela _tab, Token t, char _c_tp )
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

	  	if ( !_tab.incluir( simb ) )
	  	{
			System.out.println("erro: variável " + t.image + " repetida na linha " + t.beginLine + "\n");
	  	}
	 
    }  

	
}
