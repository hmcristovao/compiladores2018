package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import comando.primitivo.PrimitivoEntrada;
import comando.primitivo.PrimitivoSaida;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.TipoDado;

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

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivo() {
	//	int referencia = this.variavel.getReferencia();
//		TipoDado tipo = this.variavel.getTipo();
		
//		PrimitivoSaida comandoPrimitivo = new PrimitivoSaida(expressao);
//		ListaComandosPrimitivos comandoSaida = new ListaComandosPrimitivos();
//		comandoSaida.addComando(comandoPrimitivo);
		
		return null; //comandoSaida;
	}
}
