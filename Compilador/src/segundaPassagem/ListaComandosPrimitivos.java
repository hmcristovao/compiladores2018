package segundaPassagem;

import java.util.LinkedList;

import primeiraPassagem.ComandoAltoNivel;

public class ListaComandosPrimitivos {
	private LinkedList<ComandoPrimitivo> ListaComandosPrimitivos;
	
	public ListaComandosPrimitivos() {
		this.ListaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
	}

	public void addComando(ComandoPrimitivo _comando) {
		this.ListaComandosPrimitivos.add(_comando);
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosPrimitivos() {
		return null;
	}
	
	public String geraCodigoDestinoTotal() {
		return this.geraCodigoDestinoTotal().toString();
	}
	
	public String toString() {
		return this.getListaComandosPrimitivos().toString();
	}
}
