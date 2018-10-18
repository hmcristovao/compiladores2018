package geradorCodigo;

import java.util.LinkedList;
import semantico.Item;
import semantico.TipoDado;

public class Expressao {
	LinkedList<Item> listaExpInfixa;
	LinkedList<Item> listaExpPosfixa;	
	
	public Expressao()
	{
		this.listaExpInfixa = new LinkedList<Item>();
		this.listaExpPosfixa = new LinkedList<Item>();
	}
	
	public LinkedList<Item> getListaExpInfixa() {
        return this.listaExpInfixa;
    }
	public LinkedList<Item> getListaExpPosfixa() {
        return this.listaExpPosfixa;
    }
	
	void addItemInfixo(Item _item) {
        this.listaExpInfixa.add(_item);
    }
	public void addItemPosfixo(Item _item) {
		this.listaExpPosfixa.add(_item);
	}
	
	 TipoDado getTipo() {
		return null;
	 }
	 
	 public String geraCodigoDestino() {
		 String codigoDestino;
	//	for(Item item : listaExpPosfixa)
	//		if(item.get {}
		return null;
	 }
	 
	 public String toString() {
		return this.listaExpPosfixa.toString();
	 }
}
