package comandoAltoNivel;

import geradorCodigo.Expressao;

public class ComandoEnquanto extends ComandoAltoNivel{
	
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	Expressao expressao;
	
	public ComandoEnquanto (Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}
	
	public String toString() {
		return "Enquanto " + this.expressao.getListaExpPosFixa() +"\n";
	}

}
