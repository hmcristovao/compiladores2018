package comandos;
import geradorCodigo.*;
import primitivo.*;
import parser.*;
import primitivo.ListaComandosPrimitivos;

public class ComandoEnquanto extends ComandoAltoNivel{
	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	
	public ComandoEnquanto(Expressao exp, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		super(token);
		this.expressao = exp;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}
	
	public String toString() {
		return this.token + "/" + this.expressao.listaExpPosfixa + "/" + this.listaComandosAltoNivelTrue.listaComandosAltoNivel;
	}	
	
	public ComandoPrimitivo geraListaComandosPrimitivos() {
		return null;//TO-DO
	}
	
}
