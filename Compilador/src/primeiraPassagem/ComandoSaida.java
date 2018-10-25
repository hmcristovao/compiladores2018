package primeiraPassagem;
import geradorCodigo.*;
import parser.Token;
import segundaPassagem.*;
import semantico.TipoDado;
public class ComandoSaida extends ComandoAltoNivel{

	private Expressao expressao;
	
	public ComandoSaida(Expressao _expressao, Token _token) {
		super(_token);
		this.expressao=_expressao;
	}
	
	public String toString() {
		return super.getLexema() + this.expressao.toString();
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		ComandoPrimitivo primitivoSaida = new PrimitivoSaida(TipoDado.NUMERO,this.expressao.geraCodigoDestino());//???
		lista.addComando(primitivoSaida);
		return lista;
	}
}
