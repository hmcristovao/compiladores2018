package geradorCodigo;

import java.util.*;

import parser.Token;
import semantico.*;

public class Expressao {
	public LinkedList<Item> listaExpInfixa;
	public LinkedList<Item> listaExpPosfixa;
	public Expressao(){
		listaExpInfixa = new LinkedList<Item>();
		listaExpPosfixa = new LinkedList<Item>();
		
	}
	public void addItemPosFixa(Token v, Tipo t) {
		Item novoItem = new Item();
		novoItem.setValor(v.image);
		novoItem.setTipo(t);
		this.listaExpPosfixa.add(novoItem);
		
	}
}
