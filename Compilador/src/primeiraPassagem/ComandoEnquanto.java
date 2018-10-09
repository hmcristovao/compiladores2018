package primeiraPassagem;
import geradorCodigo.*;
public class ComandoEnquanto extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandoAltoNivel listaComandoAltoNivelTrue;
	
	public ComandoEnquanto(Expressao _expressao,ListaComandoAltoNivel _listaComandoAltoNivelTrue) {
		this.expressao=_expressao;
		this.listaComandoAltoNivelTrue=_listaComandoAltoNivelTrue;	
	}
	
	public String toString() {
		return null;
	}
}
