package comandoAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoGoto;
import comandoPrimitivo.PrimitivoLabel;
import comandoPrimitivo.PrimitivoSeExpFalsoGoto;
import parser.Token;
import semantico.Expressao;

public class ComandoFazerEnquanto extends ComandoAltoNivel{
	private ListaComandosAltoNivel listaComandosAltoNivelTrue;
	private Expressao expressao;
	
	public ComandoFazerEnquanto (Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue, Token token) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
		this.token = token;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos listaTrue = listaComandosAltoNivelTrue.geraListaComandoPrimitivosCompleta();
		PrimitivoLabel labelFalse = new PrimitivoLabel("LABELFALSE");
		PrimitivoLabel labelInicioFazerEnquanto = new PrimitivoLabel("LABELINICIOFAZERENQUANTO");
		PrimitivoGoto comandoGoto = new PrimitivoGoto(labelInicioFazerEnquanto);
		
		//lista de comandos que só contem um comando pois a comandoExpFalsoGoto só recebe uma lista de comandos primitivos
		// a lista só contem o comando para ir para o goto do inicio do comando do-while
		ListaComandosPrimitivos listaGotoFazerEnquanto = new ListaComandosPrimitivos();
		listaGotoFazerEnquanto.addComando(comandoGoto);
		
		//caso a expressao seja falsa sai do laço, caso seja verdadeira volta para o inicio de do-while
		PrimitivoSeExpFalsoGoto comandoSeExpFalsoGoto = new PrimitivoSeExpFalsoGoto(this.expressao.geraCodigoDestino(), labelFalse, listaGotoFazerEnquanto);
		 
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		lista.addComando(labelInicioFazerEnquanto);
		
		//lista true			
		for(int i = 0; i < listaTrue.getListaComandosPrimitivos().size(); i++) {
			//pega todos os comandos de listaComandosAltoNivelTrue e adiciona (não achei uma maneira mais fácil de fazer isso ainda)
			lista.addComando(listaTrue.getListaComandosPrimitivos().get(i));
		}
		//labelFalse sai, se for true tem que ir para labelInicioFazerEnquanto
		lista.addComando(comandoSeExpFalsoGoto);		
		lista.addComando(labelFalse);	
		
		return lista;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
