package geradorCodigo;

import java.util.LinkedList;
import semantico.*;

public class Expressao {
	
	LinkedList<Item> listaExpInfixa;
	LinkedList<Item> listaExpPosFixa;
	
	public Expressao() {
		listaExpInfixa = new LinkedList<Item>();
		listaExpPosFixa = new LinkedList<Item>();
		
	}
	
	public void addListaExpPosFixa(Enum<?> tipo, String variavel) {
		Item item = new Item(tipo, variavel);
		this.listaExpPosFixa.add(item);
	}
	
	public void imprimeExpressao() {
		System.out.println(listaExpPosFixa);
	}
	

}
