package comandoAltoNivel;
import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Token;
import semantico.*;

public class ComandoAtribuicao extends ComandoAltoNivel {
	Simbolo simbolo;
	Expressao exp;
	
	public ComandoAtribuicao(Token token, Simbolo simbolo, Expressao exp) {
		super(token);
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		return null;
	}
	
	public String toString() {
		return null;
	}
}
