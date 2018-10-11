package semantico;
import exception.*;
import parser.Token;

public class AcoesSemanticas   {
	public static void tratamentoVariavelNaoDeclarada(Tabela _tab, Token _token) throws SemanticException {
		if(!_tab.isExiste(_token.image))
				throw new SemanticException("Linha: "+_token.beginLine + " - Variavel -" + _token.image + "- nao declarada." );
	} 
	
	public static void tratamentoDeclaracao(Tabela _tab, Token _token, TipoDado _tipo) {
		if(_tab.isExiste(_token.image))
			throw new SemanticException("Linha: "+_token.beginLine + " - Variavel -" + _token.image + "- ja declarada." );
		else{
			Simbolo _simb = null;
			if(_tipo == TipoDado.NUM) {
				 _simb = new Simbolo(_token, TipoDado.NUM, _tab.get_marcador());	
				 _tab.inclui(_simb);
				 _tab.set_marcador(_tab.get_marcador() + 2);	 
			}	
			else {
				_simb = new Simbolo(_token, TipoDado.STR, _tab.get_marcador());
				_tab.inclui(_simb);
				_tab.set_marcador(_tab.get_marcador() + 1);
			}
		}
	} 
}
