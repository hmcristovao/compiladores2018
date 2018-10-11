package comando;

import java.util.LinkedList;

public class ListaComandoAltoNivel {
	LinkedList<ComandoAltoNivel> listaComandoAltoNivel;
	
	public ListaComandoAltoNivel(){
		this.listaComandoAltoNivel = new LinkedList<ComandoAltoNivel>();
	}
	LinkedList<ComandoAltoNivel> getListaComandosAltoNivel(){
		return this.listaComandoAltoNivel;
	}
	
	public void addComando(ComandoAltoNivel _comando) {
		this.listaComandoAltoNivel.add(_comando);
	}
	
	public String toString() {
		return listaComandoAltoNivel.toString();
	}
}
