package segundaPassagem;

import java.util.LinkedList;

import primeiraPassagem.ComandoAltoNivel;

public class ListaComandosPrimitivos {
	private LinkedList<ComandoPrimitivo> listaComandosPrimitivos;
	
	public ListaComandosPrimitivos() {
		this.listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
	}

	public void addComando(ComandoPrimitivo _comando) {
		this.listaComandosPrimitivos.add(_comando);
	}
	
	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos() {
		return this.listaComandosPrimitivos;
	}
	
	public String geraCodigoDestinoTotal() {
		String saida="";
		for(int i=0; i < listaComandosPrimitivos.size();i++) {
			ComandoPrimitivo com = listaComandosPrimitivos.get(i);
			saida+=com.geraCodigoDestino();
		}
		return saida;
	}
	
	public String toString() {
		return "{" + this.getListaComandosPrimitivos().toString() + "}";
	}
}
