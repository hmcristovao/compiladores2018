package geradorCodigo;

import java.util.LinkedList;

import semantico.Tipo;

public class Expressao {


	private LinkedList<Item> listaExpInfixa;
	private LinkedList<Item> listaExpPosFixa;
	
	public LinkedList<Item> getListaExpInfixa() {
		return this.listaExpInfixa;
	}

	public void setListaExpInfixa(LinkedList<Item> listaExpInfixa) {
		this.listaExpInfixa = listaExpInfixa;
	}

	public LinkedList<Item> getListaExpPosFixa() {
		return this.listaExpPosFixa;
	}

	public void setListaExpPosFixa(LinkedList<Item> listaExpPosFixa) {
		this.listaExpPosFixa = listaExpPosFixa;
	}
	
	public Expressao() {
		listaExpInfixa  = new LinkedList<Item>();
		listaExpPosFixa  = new LinkedList<Item>();
		
	}
	
	public void addListaPos (String valor, Tipo tipo) {
		 Item item = new Item();
	     item.setTipo(tipo);
	     item.setValor(valor);
	     listaExpPosFixa.add(item);
	}
	
	public void addListaInf (String valor, Tipo tipo) {
		Item item = new Item();
	     item.setTipo(tipo);
	     item.setValor(valor);
		listaExpInfixa.add(item);
	}

}
