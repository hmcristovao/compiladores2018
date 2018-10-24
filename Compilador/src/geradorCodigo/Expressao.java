package geradorCodigo;

import java.util.*;

import semantico.*;

public class Expressao {
	public LinkedList<Item> expressaoInfixa;
	public LinkedList<Item> expressaoPosfixa;
	public static int idExpressao = 0;
	public Expressao(){
		this.expressaoInfixa = new LinkedList<Item>();
		this.expressaoPosfixa = new LinkedList<Item>();
		idExpressao++;
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
			
			//verifica de antemão se é uma concatenação, se for pula os dois argumentos (OTIMIZAÇÃO)
			if(i < this.expressaoPosfixa.size()-2
				&& this.expressaoPosfixa.get(i+2) instanceof Operador
				&& this.expressaoPosfixa.get(i+2).token.image.equals("&")) {
					i+=2;
					//a concatenação sempre vai gerar uma string
					//pega os dois operandos, cria uma unica string e empilha
					Operando op1, op2;
					op1 = (Operando)this.expressaoPosfixa.get(i-2);
					op2 = (Operando)this.expressaoPosfixa.get(i-1);
					
					//codigo concatena
					codExpressao+="new java/lang/StringBuilder\r\n"
							+ "dup\r\n"
							+ "invokespecial java/lang/StringBuilder/<init>()V\r\n";
					
					//primeiro operando
					if(op1.getTipoElemento() == TipoElemento.CTE) { //caso seja uma constante
						if(op1.getTipoDado() == TipoDado.NUM) { //caso seja um número
							Double numero = Double.parseDouble(op1.token.image);
							codExpressao+="ldc2_w "+numero+"\r\n";
						}
						
						if(op1.getTipoDado() == TipoDado.STR) { //caso seja uma string
							codExpressao+="ldc "+op1.token.image+"\r\n";
						}
					}
					
					if(op1.getTipoElemento() == TipoElemento.VAR) { //caso seja uma variavel
						Simbolo simbolo = Tabela.tab.get(op1.token.image);
						if(op1.getTipoDado() == TipoDado.NUM) { //caso seja um número
							codExpressao+="dload "+simbolo.getReferencia()+"\r\n";
						}
						
						if(op1.getTipoDado() == TipoDado.STR) { //caso seja uma string
							codExpressao+="aload "+simbolo.getReferencia()+"\r\n";
						}
					}
					
					
					
					codExpressao+="invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\r\n";
					
					//segundo operando
					if(op2.getTipoElemento() == TipoElemento.CTE) { //caso seja uma constante
						if(op2.getTipoDado() == TipoDado.NUM) { //caso seja um número
							Double numero = Double.parseDouble(op2.token.image);
							codExpressao+="ldc2_w "+numero+"\r\n";
						}
						
						if(op2.getTipoDado() == TipoDado.STR) { //caso seja uma string
							codExpressao+="ldc "+op2.token.image+"\r\n";
						}
					}
					
					if(op2.getTipoElemento() == TipoElemento.VAR) { //caso seja uma variavel
						Simbolo simbolo = Tabela.tab.get(op2.token.image);
						if(op2.getTipoDado() == TipoDado.NUM) { //caso seja um número
							codExpressao+="dload "+simbolo.getReferencia()+"\r\n";
						}
						
						if(op2.getTipoDado() == TipoDado.STR) { //caso seja uma string
							codExpressao+="aload "+simbolo.getReferencia()+"\r\n";
						}
					}
					codExpressao+= "invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\r\n"
							+ "invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;\r\n";
					codExpressao+=";end concatenacao\n";
					continue;
			}
			
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
					if(operando.getTipoDado() == TipoDado.NUM) { //caso seja um número
						codExpressao+="dload "+simbolo.getReferencia()+"\r\n";
					}
					
					if(operando.getTipoDado() == TipoDado.STR) { //caso seja uma string
						codExpressao+="aload "+simbolo.getReferencia()+"\r\n";
					}
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
					codExpressao+=";begin ou logico\n"
							+"dup\r\n"
							+ "dconst_0\r\n"
							+ "dcmpg\r\n"
							+ "dstore_1\r\n"
							+ "dcmpg\r\n"
							+ "dload_1\r\n"
							+ "dcmpg\r\n"
							+ "ifeq EMPILHA_"+idExpressao+"\r\n"
							+ "dconst_1\r\n"
							+ "goto FIM_"+idExpressao+"\r\n"
							+ "EMPILHA_"+idExpressao+": dconst_0 \r\n"
							+ "FIM_"+idExpressao+ ": nop\r\n"
							+ ";end ou logico\n";
				
				}
				
				if(operador.token.image.equals("=")) { //igual(comparação lógica)
					codExpressao+=";begin igual logico\n"
							+ "dcmpg\r\n"
							+ ";end igual logico\n";
				}
			}
		}
		
		return codExpressao;
	}
	
	public String toString() {
		return "expressaoPosFixa: "+Arrays.toString(this.expressaoPosfixa.toArray());
	}	
	
}
