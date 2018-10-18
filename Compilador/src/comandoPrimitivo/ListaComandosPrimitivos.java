package comandoPrimitivo;

import java.util.LinkedList;

public class ListaComandosPrimitivos {
	LinkedList<ComandoPrimitivo> listaComandosPrimitivos;
	
	public ListaComandosPrimitivos() {
		listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
	}

	public void addComando(ComandoPrimitivo comando) {
		this.listaComandosPrimitivos.add(comando);
	}
	
	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos(){
		return this.listaComandosPrimitivos;
	}
	
	public String geraCodigoDestinoTotal() {
		return "geraCodigoDestinoTotal";
	}
	
	public String toString() {
		return "ListaComandosPrimitivos";
	}
}
