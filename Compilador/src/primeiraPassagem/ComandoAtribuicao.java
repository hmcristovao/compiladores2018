package primeiraPassagem;
import semantico.*;
import geradorCodigo.*;
import parser.Token;
import segundaPassagem.*;
public class ComandoAtribuicao extends ComandoAltoNivel{
	private Simbolo variavel;
	private Expressao expressao;
	
	public ComandoAtribuicao(Simbolo _variavel, Expressao _expressao, Token _token) {
		super(_token);
		this.variavel=_variavel;
		this.expressao=_expressao;
	}
	public String toString() {
		return this.variavel.getLexema() + super.getLexema() + this.expressao.toString();
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos(){
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		ComandoPrimitivo primitivoAtribuicao = new PrimitivoAtribuicao(this.variavel.getReferencia(),this.variavel.getTipo()," ");
		lista.addComando(primitivoAtribuicao);
		return lista;
	}
}
