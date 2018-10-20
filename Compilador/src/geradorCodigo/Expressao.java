package geradorCodigo;

import java.util.*;

import semantico.*;

public class Expressao {
	public LinkedList<Item> expressaoInfixa;
	public LinkedList<Item> expressaoPosfixa;
	public static int heapControl;
	public Expressao(){
		this.expressaoInfixa = new LinkedList<Item>();
		this.expressaoPosfixa = new LinkedList<Item>();
		heapControl = 0;
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
	
	public String geraCodigoDestino(){ //terceira passagem
		String codExpressao = "";
		
		for(int i = 0; i < this.expressaoPosfixa.size(); i++) {
			
			//caso seja um operando
			if(this.expressaoPosfixa.get(i) instanceof Operando) {
				Operando operando = (Operando) this.expressaoPosfixa.get(i);
				if(operando.getTipoElemento() == TipoElemento.CTE) { //caso seja uma constante
					if(operando.getTipoDado() == TipoDado.NUM) { //caso seja um número
						Double numero = Double.parseDouble(operando.token.image);
						codExpressao+="ldc2_w "+numero+"\r\n";
					}
					
					if(operando.getTipoDado() == TipoDado.STR) { //caso seja uma string
						codExpressao+="ldc "+operando.token.image+"\r\n";
					}
				}
				
				if(operando.getTipoElemento() == TipoElemento.VAR) { //caso seja uma variavel
					Simbolo simbolo = Tabela.tab.get(operando.token.image);
					codExpressao+="dload "+simbolo.getReferencia()+"\r\n";
				}
			}
			
			//caso seja um operador
			if(this.expressaoPosfixa.get(i) instanceof Operador) {
				Operador operador = (Operador) this.expressaoPosfixa.get(i);
				if(operador.token.image.equals("+")) { //soma
					codExpressao+="dadd\r\n";
				}
				
				if(operador.token.image.equals("-")) { //subtração
					codExpressao+="dsub\r\n";
				}
				
				if(operador.token.image.equals("*")) { //multiplicação
					codExpressao+="dmul\r\n";
				}
				
				if(operador.token.image.equals("/")) { //divisão
					codExpressao+="ddiv\r\n";
				}
				
				if(operador.token.image.equals("|")) { //ou
					//codExpressao+="\n ddiv \n";
				}
				
				if(operador.token.image.equals("<-")) { //atribuição
					//codExpressao+="\n ddiv \n";
				}
				
				if(operador.token.image.equals("=")) { //igual(comparação)
					//codExpressao+="\n ddiv \n";
				}
				
				if(operador.token.image.equals("&")) { //concatenação
					//codExpressao+="\n ddiv \n";
				}
				
			}
		}
		
		return codExpressao;
	}
	
	public String toString() {
		return "expressaoPosFixa: "+Arrays.toString(this.expressaoPosfixa.toArray());
	}	
	
}
