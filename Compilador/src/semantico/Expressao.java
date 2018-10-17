package semantico;
import java.util.LinkedList;

import comandoPrimitivo.ComandoPrimitivo;

public class Expressao {
	LinkedList<Item> expressaoInfixa = new LinkedList<Item>();
	LinkedList<Item> expressaoPosFixa = new LinkedList<Item>();
	
	public Expressao() {
		
	}

	public LinkedList<Item> getExpressaoInfixa() {
		return expressaoInfixa;
	}

	public LinkedList<Item> getExpressaoPosFixa() {
		return expressaoPosFixa;
	}
	
	public void AddItemInfixo(Item _item) {
		
	}
	
	public void AddItemPosfixo(Item _item) {
		
	}
	
	public TipoDado getTipo() { 
		// todo código aqui
		return null;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return this.expressaoInfixa.toString();
	}
}
