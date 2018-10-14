package semantico;
import parser.*;
import tratamentoErro.*;



public class AcaoSemantica
{

	public static void declaracaoPrevia(Tabela _tabela, Token _token)
	{
		if(!_tabela.verificaExistenciaSimbolo(_token.image))
		{
			throw new ErroSemantico("Variavel '"+_token.image+"' nao declara na linha "+_token.beginLine+"\n");
		}
	}

	public static void criarVariavel(Tabela _tabela, Token _token, TipoDado _tipo)
    {

	  	if ( _tabela.verificaExistenciaSimbolo( _token.image ) )
	  	{
	  		throw new ErroSemantico("Variavel '" + _token.image + "' repetida na linha " + _token.beginLine + "\n");
	  	}
	  	else
	  	{
	  		// Criar Simbolo sem passar a referencia na tabela ao construtor
			Simbolo simbolo = new Simbolo( _token, _tipo );
	  		_tabela.incluiSimbolo(simbolo);
	  	}
	 
    }
}