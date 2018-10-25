package semantico;
import exception.*;
import parser.Token;

public class AcoesSemanticas   {
	public static void tratamentoVariavelNaoDeclarada(Tabela _tabela, Token _token) throws SemanticException {
		if(!_tabela.isExiste(_token.image))
				throw new SemanticException("Linha "+_token.beginLine +", Coluna  " + _token.beginColumn + ": Variavel -" + _token.image + "- nao declarada." );
	} 
	
	public static void tratamentoDeclaracao(Tabela _tabela, Token _token, TipoDado _tipo) {
		if(_tabela.isExiste(_token.image))
			throw new SemanticException("Linha "+_token.beginLine +", Coluna  " + _token.beginColumn + ": Variavel -" + _token.image + "- ja declarada." );
		else{
			Simbolo _simbolo = null;
			if(_tipo == TipoDado.NUM) {
				 _simbolo = new Simbolo(_token, TipoDado.NUM, _tabela.getMarcador());	
				 _tabela.inclui(_simbolo);
				 _tabela.setMarcador(_tabela.getMarcador() + 2);	 
			}	
			else {
				
				_simbolo = new Simbolo(_token, TipoDado.STR, _tabela.getMarcador());
				_tabela.inclui(_simbolo);
				_tabela.setMarcador(_tabela.getMarcador() + 1);
			}
		}
	} 
}
