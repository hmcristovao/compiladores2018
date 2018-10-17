package comando;

import java.util.LinkedList;

import comandoPrimitivo.ListaComandosPrimitivos;

public class ListaComandosAltoNivel {
	LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	public ListaComandosAltoNivel() {
		listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	}
	
	public void addComando(ComandoAltoNivel comando) {
		this.listaComandosAltoNivel.add(comando);
	}
	
	 LinkedList<ComandoAltoNivel> getListaComandosAltoNivel(){
		 return this.listaComandosAltoNivel;
	 }
	 
	 public ListaComandosPrimitivos geraListaComandosPrimitivosTotal() {
		 
		 //percorre a lista gerando os comandos de cada um
		 for (int i = 0; i < this.listaComandosAltoNivel.size(); i++) {
			 ComandoAltoNivel comando = this.listaComandosAltoNivel.get(i);
			 System.out.println(comando.toString());
		 }
		 
		 ListaComandosPrimitivos listaComandosPrimitivos = new ListaComandosPrimitivos();		 
		 return listaComandosPrimitivos;
	 }
	 
	 public String toString() {
		 return "Lista comandos alto nivel";
	 }
}
