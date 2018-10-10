package geradorCodigo;
import semantico.*;
import java.util.LinkedList;

public class Expressao {
	public LinkedList<Item> listaExpInfixa = new LinkedList<Item>();
	public LinkedList<Item> listaExpPosfixa = new LinkedList<Item>();

   void addItemPosfixo(Item _item) {
	      this.listaExpPosfixa.add(_item);
	   }
}
