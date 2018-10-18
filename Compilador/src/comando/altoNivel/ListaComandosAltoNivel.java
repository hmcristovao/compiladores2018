package comando.altoNivel;

import java.util.LinkedList;

import comando.primitivo.ComandoPrimitivo;
import comando.primitivo.ListaComandosPrimitivos;

public class ListaComandosAltoNivel {
	LinkedList<ComandoAltoNivel> listaComandoAltoNivel;
	
	public ListaComandosAltoNivel(){
		this.listaComandoAltoNivel = new LinkedList<ComandoAltoNivel>();
	}
	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel(){
		return this.listaComandoAltoNivel;
	}
	
	public void addComando(ComandoAltoNivel _comando) {
		this.listaComandoAltoNivel.add(_comando);
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivosTotal() {
		
		ListaComandosPrimitivos listaComandosPrimitivosTotal = new ListaComandosPrimitivos();
		ListaComandosPrimitivos elementoLista;
		
		for(ComandoAltoNivel comando : listaComandoAltoNivel )
		{
			elementoLista = comando.geraListaComandosPrimitivo();
			for(ComandoPrimitivo _comandoPrimitivo : elementoLista.getListaComandosPrimitivos() )
			{
				listaComandosPrimitivosTotal.addComando(_comandoPrimitivo);
			}
		}
		return listaComandosPrimitivosTotal;
	}
	
	public String toString() {
		return listaComandoAltoNivel.toString();
	}
}
