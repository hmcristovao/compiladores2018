package semantico;
import parser.*;
import tratamentoExcecao.*;

public class AcaoSemantica 
{
	public static void declaracaoPrevia( Tabela _tab, Token _t )
    {
     	if ( !_tab.isExiste( _t.image ) )
		{
			throw new ErroSemantico("Variável '" + _t.image + "' não declarada na linha " + _t.beginLine + "\n");
		}
    }
	
	public static void criarVariavel( Tabela _tab, Token t, Tipo _tp )
    {
		Simbolo simb = new Simbolo( t.image, _tp );
	  	if ( !_tab.incluir( simb ) )
	  	{
	  		throw new ErroSemantico("Variável '" + t.image + "' repetida na linha " + t.beginLine + "\n");
	  	}
	 
    }  

	
}
