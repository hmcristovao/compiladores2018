package geradorCodigo;
import java.util.LinkedList;

import semantico.*;

public class Expressao {
	public LinkedList<Item> expressaoInfixa;
	public LinkedList<Item> expressaoPosfixa;
	
	public Expressao() {
		expressaoInfixa  = new LinkedList<Item>();
		expressaoPosfixa  = new LinkedList<Item>();
		
	}
	
	public void addItemPoxfixo(Item novo) {
		expressaoPosfixa.add(novo);
	}
	
	public String toString() {
		return this.expressaoPosfixa.toString();
	}
	
	
	public void imprime() {
		System.out.println(this.expressaoPosfixa);
	}
	
}