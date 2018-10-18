package comando;

import java.util.LinkedList;

import comandoPrimitivo.ComandoPrimitivo;
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
		 ListaComandosPrimitivos listaComandosPrimitivosTotal = new ListaComandosPrimitivos();
		 //percorre a lista gerando os comandos de cada um
		 for (int i = 0; i < this.listaComandosAltoNivel.size(); i++) {
			 ComandoAltoNivel comando = this.listaComandosAltoNivel.get(i);
			 
			 //pega os comandos primitivos de um determinado comando de alto nível			 
			 //percorre cada comando individualmente
			 LinkedList<ComandoPrimitivo> listaComandosPrimitivosAux = comando.geraListaComandosPrimitivos().getListaComandosPrimitivos();
			 for (int j = 0; j < listaComandosPrimitivosAux.size(); j++) {
				 //adiciona cada comando na lista de comandos total
				 listaComandosPrimitivosTotal.addComando(listaComandosPrimitivosAux.get(i));
			 }			 
		 }
		 return listaComandosPrimitivosTotal;
	 }
	 
	 public String toString() {
		 return "Lista comandos alto nivel";
	 }
}
