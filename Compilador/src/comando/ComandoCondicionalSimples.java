package comando;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoLabel;
import comandoPrimitivo.PrimitivoSeExpFalsoGoto;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalSimples extends ComandoCondicional {

	public ComandoCondicionalSimples(
			Token token,
			Expressao expressao,
			ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		super(token, expressao, listaComandosAltoNivelTrue);
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		PrimitivoLabel labelFalse = new PrimitivoLabel("condicionalSimples");
		PrimitivoSeExpFalsoGoto primitivoCondicionalSimples = new PrimitivoSeExpFalsoGoto(expressao.geraCodigoDestino(), labelFalse, listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal());
		
		ListaComandosPrimitivos listaCondicionalSimples = new ListaComandosPrimitivos();
		
		//adiciona os comandos na ordem
		listaCondicionalSimples.addComando(primitivoCondicionalSimples);
		listaCondicionalSimples.addComando(labelFalse);
		
		return listaCondicionalSimples;
	}
	
	public String toString() {
		return "ComandoCondicionalSimples";
	}
}
