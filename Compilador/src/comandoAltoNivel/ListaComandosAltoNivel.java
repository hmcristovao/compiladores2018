package comandoAltoNivel;

import java.util.LinkedList;

public class ListaComandosAltoNivel {
	

	LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	public ListaComandosAltoNivel() {
		listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();   
	}
	
	public void addComando(ComandoAltoNivel comando) {
		listaComandosAltoNivel.add(comando);
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel(){
		return listaComandosAltoNivel;
	}
	
	
	@Override
	public String toString()
	{
		return  this.getListaComandosAltoNivel().toString();
	}
	


}
