package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import comando.primitivo.PrimitivoSaida;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Item;
import semantico.Operando;
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
		ListaComandosPrimitivos comandoSaida = new ListaComandosPrimitivos();
		TipoDado tipo = TipoDado.NUM;
		
		for(Item item : expressao.getListaExpPosfixa()) {
			if(item.getLexema().equals("Operando")) {
				Operando operando = (Operando)item;
				if(operando.getTipoDado() == TipoDado.STR) tipo = TipoDado.STR;
			}
		}
		PrimitivoSaida comando = new PrimitivoSaida(this.expressao.geraCodigoDestino(), tipo);
		comandoSaida.addComando(comando);	
		return comandoSaida;
	}
}
