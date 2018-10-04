package geradorCodigo;

import java.util.LinkedList;
import semantico.Item;

public class Expressao {
	LinkedList<Item> listaExpInfixa = new LinkedList<Item>();
	
	public void expressao(Item item){
		listaExpInfixa.add(item);
	}
}
