package primeiraPassagem;
import parser.Token;
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
}
