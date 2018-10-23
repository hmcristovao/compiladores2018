package comandoAltoNivel;

import comandoPrimitivo.*;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoEnquanto extends ComandoAltoNivel{
	
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	Expressao expressao;
	
	public ComandoEnquanto (Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
		this.token = token;
	}
	
	public String toString() {
		return this.getLexama() + " " + this.expressao.getListaExpPosFixa() + "\n" + listaComandosAltoNivelTrue.toString() + "\n";
	}

	@Override
	ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		ListaComandosPrimitivos listaComandosPrimitivosTrue = listaComandosAltoNivelTrue.geraListaComandoPrimitivosCompleta();
		PrimitivoLabel labelFalse = new PrimitivoLabel("LabelFalse");
		PrimitivoLabel labelInicioEnquanto = new PrimitivoLabel("LabelEnquanto");
		PrimitivoGoto comandoGoto = new PrimitivoGoto(labelInicioEnquanto);
		
		PrimitivoSeExpFalsoGoto comando = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFalse, listaComandosPrimitivosTrue);
		 
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		lista.addComando(labelInicioEnquanto);
		lista.addComando(comando);
		lista.addComando(comandoGoto);		
		lista.addComando(labelFalse);	
		
		return lista;
	}

}
