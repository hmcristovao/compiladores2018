package comando.altoNivel;

import comando.primitivo.ListaComandosPrimitivos;
import comando.primitivo.PrimitivoLabel;
import comando.primitivo.PrimitivoSeExpFalsoGoto;
import geradorCodigo.Expressao;
import parser.Token;

public class ComandoCondicionalSimples extends ComandoCondicional {

	public ComandoCondicionalSimples(Token _token,Expressao _expressao, ListaComandosAltoNivel _listaComandosAltoNivel) {
		super(_token, _expressao, _listaComandosAltoNivel);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando Condicional Simples\n" +"Se expressao " + this.expressao.toString() +" Lista de Comandos: "+  listaComandosAltoNivelTrue;
	}
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivo() {
		// TODO Auto-generated method stub
		
		ListaComandosPrimitivos listaCmdCondicionalSimples = new ListaComandosPrimitivos();
		ListaComandosPrimitivos listaCmdPriTrue = super.getListaComandosAltoNivelTrue().geraListaComandosPrimitivosTotal();
		
		PrimitivoLabel labelFalse = new PrimitivoLabel("LabelFalse");
		PrimitivoSeExpFalsoGoto seExpFalseGoto = new PrimitivoSeExpFalsoGoto("expDestAssemb", labelFalse, listaCmdPriTrue);
		listaCmdCondicionalSimples.addComando(seExpFalseGoto);
		listaCmdCondicionalSimples.addComando(labelFalse);
		
		
		return null;
	}
}
