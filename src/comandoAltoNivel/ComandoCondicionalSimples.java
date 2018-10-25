package comandoAltoNivel;

import gerador.Expressao;
import comandoPrimitivo.*;
import parser.Token;

public class ComandoCondicionalSimples extends ComandoCondicional {

    public ComandoCondicionalSimples(Token token, Expressao _exp, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
    	super(token,_exp, listaComandosAltoNivelTrue);
    }



   public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos listaPrimitivaCondicionalSimples = new ListaComandosPrimitivos();
		
		PrimitivoLabel Lfalse = new PrimitivoLabel("LabelFalse");
		PrimitivoSeExpFalsoGoto primitivoCondiocionalSimples = new PrimitivoSeExpFalsoGoto(expressao.geraCodigoDestino(), Lfalse, listaComandosAltoNivelTrue.geraListaComandosPrimitivosTotal());
		
		
		listaPrimitivaCondicionalSimples.addComando(primitivoCondiocionalSimples);
		listaPrimitivaCondicionalSimples.addComando(Lfalse);
		
		return listaPrimitivaCondicionalSimples;
    }
    
    public String toString() {
    	return "\n\nComando Condicional Simples:" + this.expressao.toString() + "\n\nLista de Comandos True:" + this.listaComandosAltoNivelTrue.toString();
    }

}