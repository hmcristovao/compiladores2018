package semantico;
<<<<<<< Upstream, based on origin/grupo01
import exception.*;

public class AcoesSemanticas   {
	public static boolean tratamentoVariavelNaoDeclarada(Tabela _tab, String _elemento) {
		try {
			if(!_tab.isExiste(_elemento))
				throw new SemanticException("Erro semantico\nVariavel -" + _elemento + "- nao declarada." );
		}catch(SemanticException e) {
		   	 System.out.println(e.getMessage());
		   	 return true;
      	 }
		return false;
	} 
	
	public static boolean tratamentoDeclaracao(Tabela _tab, String _elemento, Tipo _tipo) {
		try {
			if(_tab.isExiste(_elemento))
				throw new SemanticException("Erro semantico\nVariavel -" + _elemento + "- ja declarada." );
			else {
				Simbolo _simb = null;
				if(_tipo == Tipo.numero) {
					 _simb = new Simbolo(_elemento, Tipo.numero, _tab._marcador);
					 _tab.inclui(_simb);
					 _tab._marcador += 2;
					 
				}	
				else {
					_simb = new Simbolo(_elemento, Tipo.palavra, _tab._marcador);
					_tab.inclui(_simb);
					_tab._marcador += 1;
				}
				return false;
			}
		}catch(SemanticException e) {
		   	 System.out.println(e.getMessage());
		   	 return true;
      	 }
=======
import excecao.*;

public class AcoesSemanticas   {
	public static void tratamentoVariavelNaoDeclarada(Tabela _tab, String _elemento) throws ErroSemantico {
		if(!_tab.isExiste(_elemento))
				throw new ErroSemantico("Variavel -" + _elemento + "- nao declarada." );
	} 
	
	public static void tratamentoDeclaracao(Tabela _tab, String _elemento, Tipo _tipo) {
		if(_tab.isExiste(_elemento))
			throw new ErroSemantico("Variavel -" + _elemento + "- ja declarada." );
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
>>>>>>> 3bd74c1 Correções e padronização do código (finalização) - Atividade 04/10:
	} 
}
