package comandoPrimitivo;

import java.util.LinkedList;




public class ListaComandosPrimitivos {
	private LinkedList<ComandoPrimitivo> listaComandosPrimitivos;
	
	public ListaComandosPrimitivos(){
		listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
	}
	
	public void addComando(ComandoPrimitivo _comando) {
		this.listaComandosPrimitivos.add(_comando);
	}
	
	public String  geraCodigoDestinoTotal() {
		return null;
	}
	
	public String toString(){
		return this.listaComandosPrimitivos.toString();
	}

}
