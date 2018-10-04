package geradorCodigo;
import java.util.LinkedList;
import semantico.*;

public class Expressao {
	static LinkedList<Item> listaExp = new LinkedList<Item>();

	public void add(Tipo _tipo, String _valor) {
		Item novo= new Item(_tipo, _valor);
		listaExp.add(novo);
	}
	
	public void imprime() {
		System.out.println(this.listaExp);
	}
}