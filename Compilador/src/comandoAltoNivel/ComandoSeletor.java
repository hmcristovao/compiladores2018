package comandoAltoNivel;

import java.util.LinkedList;
import comandoPrimitivo.*;
import parser.Token;
import semantico.*;

public class ComandoSeletor extends ComandoAltoNivel{
	
	private static final Expressao String = null;
	private Expressao expressao;
	private LinkedList<ListaComandosAltoNivel> listaComandosAltoNivelCasos = new LinkedList<ListaComandosAltoNivel>();
	private LinkedList<Item> itemOpcaoCasos = new LinkedList<Item>();
  	
  	public ComandoSeletor(Expressao expressao, LinkedList<ListaComandosAltoNivel> listaComandosAltoNivelCasos, LinkedList<Item> itemOpcaoCasos, Token token){
  		this.expressao = expressao;
  		this.listaComandosAltoNivelCasos = listaComandosAltoNivelCasos;
  		this.itemOpcaoCasos = itemOpcaoCasos;
  		this.token = token;
  		
  	}

	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();	
		
		//Para cada caso dentro do seletor devesse gerar uma lista de comandos primitivos
		for(int i = 0; i < listaComandosAltoNivelCasos.size(); i++) {
			
			ListaComandosPrimitivos listaTrue = this.listaComandosAltoNivelCasos.get(i).geraListaComandoPrimitivosCompleta();		
			
			PrimitivoLabel labelFalse = new PrimitivoLabel("LABELFALSECASO");
			
			//No switch tem que se comparar a expressao principal com a de cada caso 
			//Entao foi criado uma expressao para poder compara-las 
			
			Item itemIgual = new Operador(TipoOperador.IGUAL, null);
			Expressao expressaoCaso = new Expressao();
			expressaoCaso.addListaExpPosFixa(itemOpcaoCasos.get(i));
			expressaoCaso.addListaExpPosFixa(itemIgual);	
			
			String codigoDestinoExpressaoComCaso = this.expressao.geraCodigoDestino() + expressaoCaso.geraCodigoDestino();
			
			PrimitivoSeExpFalsoGoto comando = new PrimitivoSeExpFalsoGoto(codigoDestinoExpressaoComCaso, labelFalse, listaTrue);
			lista.addComando(comando);
			lista.addComando(labelFalse);				
			
		}			
		
		return lista;
	}

	@Override
	public String toString() {
		return "\nComando Seletor - lexema: \"" + this.getLexema() 
	     + "\" - expressao: " + this.expressao + " - listas comandos Casos: " 
	     + this.listaComandosAltoNivelCasos;
	}

}
