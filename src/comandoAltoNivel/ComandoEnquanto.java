package comandoAltoNivel;
import comandoPrimitivo.*;

import gerador.Expressao;
import parser.Token;

public class ComandoEnquanto extends ComandoAltoNivel {

    private Expressao expressao;
    private ListaComandosAltoNivel listaComandosAltoNivelTrue;

    public ComandoEnquanto(Token token, Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
    	super(token);
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}

    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos listaPrimitivoEnquanto = new ListaComandosPrimitivos();
		
		PrimitivoLabel Linicio= new PrimitivoLabel("LabelInicio");
		PrimitivoLabel Lfalse = new PrimitivoLabel("LabelFalse");	
		PrimitivoSeExpFalsoGoto primitivoEnquanto = new PrimitivoSeExpFalsoGoto(expressao.geraCodigoDestino(), Lfalse, listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal());
		PrimitivoGoto gotoEnquanto = new PrimitivoGoto(Linicio);
		
		listaPrimitivoEnquanto.addComando(Linicio);
		listaPrimitivoEnquanto.addComando(primitivoEnquanto);
		listaPrimitivoEnquanto.addComando(gotoEnquanto);
		listaPrimitivoEnquanto.addComando(Lfalse);
		
		
		return listaPrimitivoEnquanto;
	}

    public String toString() {
    	return "\n\nComando Enquanto:" + this.expressao.toString() + "\n\nLista de Comandos True:" + this.listaComandosAltoNivelTrue.toString();
    }

}