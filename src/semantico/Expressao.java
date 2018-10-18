package semantico;
import java.util.LinkedList;

import comandoPrimitivo.ComandoPrimitivo;

public class Expressao {
	LinkedList<Item> expressaoInfixa = new LinkedList<Item>();
	LinkedList<Item> expressaoPosfixa = new LinkedList<Item>();
	
	public Expressao() {
		
	}

	public LinkedList<Item> getExpressaoInfixa() {
		return expressaoInfixa;
	}

	public LinkedList<Item> getExpressaoPosfixa() {
		return expressaoPosfixa;
	}
	
	public void addItemInfixo(Item _item) {
		this.getExpressaoInfixa().add(_item);
	}
	
	public void addItemPosfixo(Item _item) {
		this.getExpressaoPosfixa().add(_item);
	}
	

	
	public TipoDado getTipo() { 
		// todo código aqui
		return null;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return ""+this.expressaoPosfixa;
	}
}
