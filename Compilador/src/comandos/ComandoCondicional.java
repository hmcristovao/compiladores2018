package comandos;
import geradorCodigo.*;
import parser.*;

public class ComandoCondicional extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	
	public ComandoCondicional(Expressao exp, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		super(token);
		this.expressao = exp;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}
	
	public String toString() {
		return this.token + "/" + this.expressao.listaExpPosfixa + "/";
	}	
	
}

