package geradorCodigo;

import java.util.LinkedList;
import semantico.*;

public class Expressao {
	private LinkedList<Item> expressaoExpInfixa;
	private LinkedList<Item> expressaoExpPosfixa;
	
	public Expressao(){
		expressaoExpInfixa = new LinkedList<Item>();
		expressaoExpPosfixa = new LinkedList<Item>();
	}
	
	public LinkedList<Item> getExpressaoExpInfixa(){
		return this.expressaoExpInfixa;
	}
	
	public LinkedList<Item> getExpressaoExpPosfixa(){
		return this.expressaoExpPosfixa;
	}
	
	public void addItemInfixo(Item _item){
		this.expressaoExpInfixa.add(_item);
	}
	public void addItemPosfixo(Item _item){
		this.expressaoExpPosfixa.add(_item);
	}
	public void imprime(){
		System.out.println(this.expressaoExpPosfixa);
	}
	public String toString(){
		return this.expressaoExpPosfixa.toString();
	}
	
	
}
