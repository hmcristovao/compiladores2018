package comandoAltoNivel;

import geradorCodigo.Expressao;

public class ComandoSaida extends ComandoAltoNivel {
	
	Expressao expressao;
	
	public ComandoSaida (Expressao expressao) {
		this.expressao = expressao;
	}
	
	public String toString() {
		return "exibe " + this.expressao.getListaExpPosFixa() + "\n";
	}

}
