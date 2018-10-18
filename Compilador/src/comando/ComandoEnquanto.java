package comando;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoGoto;
import comandoPrimitivo.PrimitivoLabel;
import comandoPrimitivo.PrimitivoSeExpFalsoGoto;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoEnquanto extends ComandoAltoNivel {
	Expressao expressao;
	ListaComandosAltoNivel listaComandosAltoNivelTrue;
	public ComandoEnquanto(Token token, Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		super(token);
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}

	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//segunda passagem
		
		//cria os comandos primitivos
		PrimitivoLabel labelInicio = new PrimitivoLabel("enquantoInicio");
		PrimitivoLabel labelFalse = new PrimitivoLabel("enquantoFim");
		PrimitivoSeExpFalsoGoto primitivoEnquanto = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFalse, this.listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal());
		PrimitivoGoto gotoEnquanto = new PrimitivoGoto(labelInicio);
		
		//cria a lista de comandos primitivos		
		ListaComandosPrimitivos listaEnquanto = new ListaComandosPrimitivos();
		//adiciona na ordem
		listaEnquanto.addComando(labelInicio);
		listaEnquanto.addComando(primitivoEnquanto);
		listaEnquanto.addComando(gotoEnquanto);
		listaEnquanto.addComando(labelFalse);
		
		return listaEnquanto;
	}
	
	public String toString() {		
		return null;
	}

}
