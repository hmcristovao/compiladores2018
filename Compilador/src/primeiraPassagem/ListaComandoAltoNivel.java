package primeiraPassagem;

import java.util.LinkedList;

import segundaPassagem.*;

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

	public ListaComandosPrimitivos geraListaComandosPrimitivosTotal() {
		ListaComandosPrimitivos listaComandosPrimitivos = new ListaComandosPrimitivos();
		ListaComandosPrimitivos listaParcial;
		for(ComandoAltoNivel comandoAltoNivel : this.listaComandosAltoNivel) {
			listaParcial = comandoAltoNivel.geraListaComandosPrimitivos();
			for(ComandoPrimitivo comandoPrimitivo : listaParcial.getListaComandosPrimitivos()) {
				listaComandosPrimitivos.addComando(comandoPrimitivo);
			}
		}
		return listaComandosPrimitivos;
	}
}
