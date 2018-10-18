package primitivo;
import java.util.LinkedList;

import comandos.ComandoAltoNivel;

public class ListaComandosPrimitivos {
	public LinkedList<ComandoPrimitivo> listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
	
	
	public ListaComandosPrimitivos() {
		// TODO Auto-generated constructor stub
	}
	
	public void addComando(ComandoPrimitivo cmd) {
		
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosPrimitivos(){
		return null;
	}
	
	public String geraCodigoDestinoTotal() {
		return null;
	}
	
	public String toString() {
		return "" + listaComandosPrimitivos.get(0);
	}
	
}
