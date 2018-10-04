package semantico;
import parser.*;
import tratamentoErro.*;

public class AcaoSemantica 
{
	public static void declaracaoPrevia( Tabela _tab, Token _t )
    {
     	if ( !_tab.isExiste( _t.image ) )
		{
			throw new ErroSemantico("Variavel'" + _t.image + "' nao declarada na linha " + _t.beginLine + "\n");
		}
    }
	
	public static void criarVariavel( Tabela _tab, Token t, Tipo _tp )
    {
		Simbolo simb = new Simbolo( t.image, _tp );
	  	if ( !_tab.incluir( simb ) )
	  	{
	  		throw new ErroSemantico("Variavel'" + t.image + "' repetida na linha " + t.beginLine + "\n");
	  	}
	 
    }  

	
}
