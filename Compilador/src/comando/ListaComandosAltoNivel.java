package comando;

import java.util.LinkedList;

public class ListaComandosAltoNivel {
	LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	public ListaComandosAltoNivel() {
		listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
		
	}
	public void addComandoAltoNivel(ComandoAltoNivel comando) {
		this.listaComandosAltoNivel.add(comando);
	}
}
