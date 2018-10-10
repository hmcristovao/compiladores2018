package primeiraPassagem;

import java.util.LinkedList;

public class ListaComandoAltoNivel {
	private LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	public ListaComandoAltoNivel() {
		this.listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	}
	
	public void addComando(ComandoAltoNivel _comando){
		this.listaComandosAltoNivel.add(_comando);
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandoAltoNivel(){
		return this.listaComandosAltoNivel;
	}
	
	public String toString(){
		return null;
	}
}
