package primeiraPassagem;

import java.util.LinkedList;

public class ListaComandoAltoNivel {
	public static LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	public ListaComandoAltoNivel() {
		listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	}
	
	public void addComando(ComandoAltoNivel _comando){
		listaComandosAltoNivel.add(_comando);
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandoAltoNivel(){
		return null;
	}
	
	public String toString(){
		return null;
	}
}
