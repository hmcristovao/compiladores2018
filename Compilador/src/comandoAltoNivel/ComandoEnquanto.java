package comandoAltoNivel;

import comandoPrimitivo.*;
import parser.Token;
import semantico.Expressao;

public class ComandoEnquanto extends ComandoAltoNivel{
	
	private ListaComandosAltoNivel listaComandosAltoNivelTrue;
	private Expressao expressao;
	
	public ComandoEnquanto (Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
		this.token = token;
	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		ListaComandosPrimitivos listaTrue = listaComandosAltoNivelTrue.geraListaComandoPrimitivosCompleta();
		PrimitivoLabel labelFalse = new PrimitivoLabel("LABELFALSE");
		PrimitivoLabel labelInicioEnquanto = new PrimitivoLabel("LABELINICIOENQUANTO");
		PrimitivoGoto comandoGoto = new PrimitivoGoto(labelInicioEnquanto);
		
		PrimitivoSeExpFalsoGoto comandoSeExpFalsoGoto = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFalse, listaTrue);
		 
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		lista.addComando(labelInicioEnquanto);
		lista.addComando(comandoSeExpFalsoGoto);
		lista.addComando(comandoGoto);		
		lista.addComando(labelFalse);	
		
		return lista;
	}
	
	@Override
	public String toString() {
		return "\nComando Enquanto - lexema: \"" + this.getLexema() 
		     + "\" - expressao: " + this.expressao + " - lista comandos true: " 
			 + this.listaComandosAltoNivelTrue;
	}

}
