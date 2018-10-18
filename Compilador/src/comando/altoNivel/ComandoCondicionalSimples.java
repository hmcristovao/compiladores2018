package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalSimples extends ComandoCondicional {

	public ComandoCondicionalSimples(Token _token,Expressao _expressao, ListaComandosAltoNivel _listaComandosAltoNivel) {
		super(_token, _expressao, _listaComandosAltoNivel);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando Condicional Simples\n" +"Se expressao " + this.expressao.toString() +" Lista de Comandos: "+  listaComandosAltoNivelTrue;
	}
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivo() {
		// TODO Auto-generated method stub
		return null;
	}
}
