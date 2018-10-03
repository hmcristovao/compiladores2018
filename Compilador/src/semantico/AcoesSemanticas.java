package semantico;
import exception.*;

public class AcoesSemanticas   {
	public static void tratamentoVariavelNaoDeclarada(Tabela _tab, String _elemento) throws SemanticException {
		if(!_tab.isExiste(_elemento))
				throw new SemanticException("Variavel -" + _elemento + "- nao declarada." );
	} 
	
	public static void tratamentoDeclaracao(Tabela _tab, String _elemento, Tipo _tipo) {
		if(_tab.isExiste(_elemento))
			throw new SemanticException("Variavel -" + _elemento + "- ja declarada." );
		else{
			Simbolo _simb = null;
			if(_tipo == Tipo.numero) {
				 _simb = new Simbolo(_elemento, Tipo.numero, _tab.get_marcador());	
				 _tab.inclui(_simb);
				 _tab.set_marcador(_tab.get_marcador() + 2);	 
			}	
			else {
				_simb = new Simbolo(_elemento, Tipo.palavra, _tab.get_marcador());
				_tab.inclui(_simb);
				_tab.set_marcador(_tab.get_marcador() + 1);
			}
		}
	} 
}
