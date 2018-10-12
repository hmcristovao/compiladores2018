package comando;

import geradorCodigo.Expressao;
import parser.Token;

public class ComandoEnquanto extends ComandoAltoNivel {

	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	
	public ComandoEnquanto(Token _token, Expressao _expressao, ListaComandosAltoNivel _listaComandosAltoNivel) {
		super(_token);
		this.expressao = _expressao;
		this.listaComandosAltoNivelTrue = _listaComandosAltoNivel;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando Enquanto\n" +"Enquanto expressao " + this.expressao.toString() +" Lista de Comandos: "+  listaComandosAltoNivelTrue;
	}
}
