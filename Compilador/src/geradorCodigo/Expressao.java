package geradorCodigo;

import java.util.*;

import parser.Token;
import semantico.*;

public class Expressao {
	public LinkedList<Item> expressaoInfixa;
	public LinkedList<Item> expressaoPosfixa;
	public Expressao(){
		this.expressaoInfixa = new LinkedList<Item>();
		this.expressaoPosfixa = new LinkedList<Item>();
		
	}
		
	public LinkedList<Item> getExpressaoInfixa(){
		return this.expressaoInfixa;
	}
	public LinkedList<Item> getExpressaoPosfixa(){
		return this.expressaoPosfixa;
	}
	
	public void addItemInfixo(Item _item){

	}

	
	public void addItemPosfixo(Item _item){
		if(Tabela.tab.containsKey(_item.token.image)) { //caso entre aqui, eh uma variavel
			Simbolo simb = Tabela.tab.get(_item.token.image);
			Operando operando = (Operando)_item;
			operando.setTipoDado(simb.getTipo());
			operando.setTipoElemento(TipoElemento.VAR); //
			this.expressaoPosfixa.add(operando);
		}
		else{
			this.expressaoPosfixa.add(_item);
		}

	}
	
	public String geraCodigoDestino(){
		return null;
		
	}
	
	public String toString() {
		return "expressaoPosFixa: "+Arrays.toString(this.expressaoPosfixa.toArray());
	}
	
	
	
	
}
