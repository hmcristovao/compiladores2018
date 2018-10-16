package comando.altoNivel;

import geradorCodigo.Expressao;
import parser.Token;

public class ComandoSaida extends ComandoAltoNivel {
	
	Expressao expressao;

	public ComandoSaida(Token _token,Expressao _expressao) {
		super(_token);
		this.expressao = _expressao;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando exibição\n" +"Expressão " + this.expressao.toString();
	}
}
