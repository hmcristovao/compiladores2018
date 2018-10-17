package comando;

import java.util.LinkedList;

public class ListaComandosAltoNivel {
	private LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	public ListaComandosAltoNivel(){
		listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
		//System.out.println("criou a lista\n");
	}
	
	public void addComando(ComandoAltoNivel _comando){
		System.out.println("entrou");
		this.listaComandosAltoNivel.add(_comando);
		//System.out.println("adicionou o comando\n");
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel(){
		return this.listaComandosAltoNivel;
	}
	
	public String toString(){
		return this.listaComandosAltoNivel.toString();
	}
}
