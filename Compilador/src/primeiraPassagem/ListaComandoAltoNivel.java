package primeiraPassagem;

import java.util.LinkedList;

import segundaPassagem.ListaComandosPrimitivos;

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
		return this.getListaComandoAltoNivel().toString();
	}
	public void imprime() {
		System.out.println(this.listaComandosAltoNivel);
	}
	
	public ListaComandosPrimitivos geraListaComandosPrimitivosTotal() {
		return null;		
	}
}
