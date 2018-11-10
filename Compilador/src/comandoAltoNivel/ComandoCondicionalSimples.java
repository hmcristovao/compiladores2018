package comandoAltoNivel;

import comandoPrimitivo.*;
import parser.Token;
import semantico.Expressao;

public class ComandoCondicionalSimples extends ComandoCondicional{
	
	public ComandoCondicionalSimples(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		super(expressao, listaComandosAltoNivelTrue);
		this.token = token;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		ListaComandosPrimitivos listaTrue = this.listaComandosAltoNivelTrue.geraListaComandoPrimitivosCompleta();
		PrimitivoLabel labelFalse = new PrimitivoLabel("LABELFALSE");
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		PrimitivoSeExpFalsoGoto comando = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFalse, listaTrue);
		lista.addComando(comando);
		lista.addComando(labelFalse);	
		
		return lista;
	}
	
	@Override
	public String toString() {
		return "\nComando Condicional Simples - lexema: \"" + this.getLexema() 
		     + "\" - expressao: " + this.expressao + " - lista comandos true: " 
		     + this.listaComandosAltoNivelTrue;
	}
	
}
