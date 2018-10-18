package comando.primitivo;

import java.util.LinkedList;


public class ListaComandosPrimitivos {
	LinkedList<ComandoPrimitivo> listaComandoPrimitivo;
	
	public ListaComandosPrimitivos(){
		this.listaComandoPrimitivo = new LinkedList<ComandoPrimitivo>();
	}
	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivo(){
		return this.listaComandoPrimitivo;
	}
	
	public void addComando(ComandoPrimitivo _comando) {
		this.listaComandoPrimitivo.add(_comando);
	}
	
	public String toString() {
		return listaComandoPrimitivo.toString();
	}
	
	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos(){
		return this.listaComandoPrimitivo;
		
	}
}
