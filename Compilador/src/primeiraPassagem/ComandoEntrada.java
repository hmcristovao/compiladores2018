package primeiraPassagem;
import parser.Token;
import segundaPassagem.ComandoPrimitivo;
import segundaPassagem.ListaComandosPrimitivos;
import segundaPassagem.*;
import semantico.*;

public class ComandoEntrada extends ComandoAltoNivel{
	private Simbolo variavel;
	
	public ComandoEntrada(Simbolo _variavel, Token _token) {
		super(_token);
		this.variavel=_variavel;
	}
	
	public String toString() {
		return super.getLexema() + this.variavel.getLexema();
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		ComandoPrimitivo primitivoEntrada = new PrimitivoEntrada(this.variavel.getReferencia(),this.variavel.getTipo());
		lista.addComando(primitivoEntrada);
		return lista;
	}
}
