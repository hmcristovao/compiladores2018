package parser;

import java.util.LinkedList;

public class ListaComandosPrimitivos extends ComandoPrimitivo{

	LinkedList<ComandoPrimitivo> listaComandosPrimitivos= new LinkedList<ComandoPrimitivo>();
	
	void addComando(ComandoPrimitivo comando) {
		//IMPLEMENTAÇAO VAI AQUI############################3
	}
	
	public String geraCoigoDestino() {
		//IMPLEMENTAÇAO VAI AQUI############################3
		return null;
	}

	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos(){
		return this.listaComandosPrimitivos;
	}
	public String toString() {
		return this.listaComandosPrimitivos.toString();
	}

}
