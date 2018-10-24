package comandos;
import java.util.Iterator;
import java.util.LinkedList;

import primitivo.ComandoPrimitivo;
import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoAtribuicao;
import primitivo.PrimitivoEntrada;
import primitivo.PrimitivoSaida;
import parser.*;

public class ListaComandosAltoNivel {
	
	public LinkedList<ComandoAltoNivel> listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	
	public ListaComandosAltoNivel() {
		
	}
	
	 public ListaComandosPrimitivos geraListaComandosPrimitivosTotal() {
		 ListaComandosPrimitivos lcmp = new ListaComandosPrimitivos();
		 
		 for(int i=0; i<listaComandosAltoNivel.size() ; i++) {
			 
			 if(listaComandosAltoNivel.get(i).token.toString().equals("<-")) {
				ComandoAtribuicao comandoAtrib = (ComandoAtribuicao) listaComandosAltoNivel.get(i);
				lcmp.addComando(comandoAtrib.geraListaComandosPrimitivos());	 
			 }
			 else if(listaComandosAltoNivel.get(i).token.toString().equals("le")) {
				 ComandoEntrada comandoEnt = (ComandoEntrada) listaComandosAltoNivel.get(i);
				 ComandoPrimitivo prim = new PrimitivoEntrada(comandoEnt.simbolo.getReferencia(), comandoEnt.simbolo.getTipo());
				 lcmp.listaComandosPrimitivos.add(prim);			
			 }
			 else if(listaComandosAltoNivel.get(i).token.toString().equals("exibe")) {
				 ComandoSaida comandoSai = (ComandoSaida) listaComandosAltoNivel.get(i);
				// ComandoPrimitivo prim = new PrimitivoSaida(comandoSai.expressao.toString(),);
				 //lcmp.listaComandosPrimitivos.add(prim);
			 }
			 else if(listaComandosAltoNivel.get(i).token.toString().equals("enquanto")) {
				 //faz mais coisas
			 }
		 //*/
			 //if(listaComandosAltoNivel.get(i).token.toString().equals("<-")) {
				 //ComandoAtribuicao comandoAtrib = (ComandoAtribuicao) listaComandosAltoNivel.get(i);
				// lcmp.addComando(comandoAtrib.geraListaComandosPrimitivos());
			// }
		 }	 
		 
		 return lcmp;
	 }
	
	
	public void addComando(ComandoAltoNivel comando) {		
		
		if(comando!=null)this.listaComandosAltoNivel.add(comando);

	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel()
	{
		return this.listaComandosAltoNivel;
	}
	
	@Override
	public String toString()
	{
		return "" + this.getListaComandosAltoNivel();
	}
	
}
