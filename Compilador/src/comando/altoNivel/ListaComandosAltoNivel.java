package comando.altoNivel;

import java.util.LinkedList;

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
	
	public String toString() {
		return listaComandoAltoNivel.toString();
	}
}
