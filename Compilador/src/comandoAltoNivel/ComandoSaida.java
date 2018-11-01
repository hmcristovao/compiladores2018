package comandoAltoNivel;

import comandoPrimitivo.*;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.*;

public class ComandoSaida extends ComandoAltoNivel {
	
	private Expressao expressao;
	
	public ComandoSaida (Expressao expressao, Token token) {
		this.expressao = expressao;
		this.token = token;
	}
	
	public String toString() {
		return this.getLexama() + " " + this.expressao.getListaExpPosFixa() + "\n";
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		TipoDado tipo = TipoDado.NUMERO;
		
		for(Item item : expressao.getListaExpPosFixa()) {
			if(item.getLexema().equals("Operando")) {
				Operando operando = (Operando)item;
				if(operando.getTipoDado() == TipoDado.PALAVRA) {
					tipo = TipoDado.PALAVRA;
				}
			}
		}
		
		PrimitivoSaida comando = new PrimitivoSaida(tipo, this.expressao.geraCodigoDestino());
		lista.addComando(comando);	
				
		return lista;
	}

}
