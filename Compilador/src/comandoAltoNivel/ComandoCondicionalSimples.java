package comandoAltoNivel;

import comandoPrimitivo.*;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalSimples extends ComandoCondicional{
	
	public ComandoCondicionalSimples(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		super(expressao, listaComandosAltoNivelTrue);
		this.token = token;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		ListaComandosPrimitivos listaComandosPrimitivosTrue = listaComandosAltoNivelTrue.geraListaComandoPrimitivosCompleta();
		PrimitivoLabel labelFalse = new PrimitivoLabel("LabelFalse");
		 
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		
		PrimitivoSeExpFalsoGoto comando = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFalse, listaComandosPrimitivosTrue);
		
		lista.addComando(comando);
		lista.addComando(labelFalse);	
		
		return lista;
	}

	
	public String toString() {
		return this.getLexama() + " " + this.expressao.getListaExpPosFixa()  + "\n" +  listaComandosAltoNivelTrue.toString() + "\n";
	}

	
}
