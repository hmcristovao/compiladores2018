package geradorCodigo;

import java.util.LinkedList;

import parser.Compilador;
import semantico.*;

public class Expressao {
	
	LinkedList<Item> listaExpInfixa;
	LinkedList<Item> listaExpPosFixa;
	
	static LinkedList<String> listaOperandoString =  new LinkedList<String>();
	
	public Expressao() {
		listaExpInfixa = new LinkedList<Item>();
		listaExpPosFixa = new LinkedList<Item>();
	}
	
	public LinkedList<Item> getListaExpPosFixa() {
		return listaExpPosFixa;
	}

	public void addListaExpPosFixa(Item item) {
		this.listaExpPosFixa.add(item);
	}
	
	public void imprimeExpressao() {
		System.out.println(listaExpPosFixa);
	}
	
	public String geraCodigoDestino(){
		
		String codigoDestinoExpressao = "";
		
		
		
		for(Item item : this.listaExpPosFixa) {
			
			
			if(item.getLexema().equals("Operando")) {
				
				Operando operando = (Operando)item;
				
				if(operando.getTipoDado() == TipoDado.NUMERO) {
					if(operando.getTipoElemento() == TipoElemento.CTE){
						codigoDestinoExpressao += "ldc2_w " + Float.parseFloat(operando.getValor()) + "\n";
					}
					
					if(operando.getTipoElemento() == TipoElemento.VAR){
											
						int referencia = Compilador.tabela.pesquisaTabela(operando.getValor()). getReferencia();
						
						if(referencia >= 4) {
							codigoDestinoExpressao += "dload " + referencia + "\n";
						}else {
							codigoDestinoExpressao += "dload_" + referencia + "\n";
						}
					}
				}
				
				if(operando.getTipoDado() == TipoDado.PALAVRA) {
					
					if(operando.getTipoElemento() == TipoElemento.CTE){
						codigoDestinoExpressao += "ldc " + operando.getValor() + "\n";
						listaOperandoString.add(operando.getValor());
					}
					
					if(operando.getTipoElemento() == TipoElemento.VAR){
											
						int referencia = Compilador.tabela.pesquisaTabela(operando.getValor()).getReferencia();						
						codigoDestinoExpressao += "aload " + referencia + "\n";
					}
					
				}
				
			}
				
			
			if(item.getLexema().equals("Operador")) {
				
				Operador operador = (Operador)item;
			
				
				if(operador.getTipoOperador() == TipoOperador.SOMA) {
					codigoDestinoExpressao += "dadd\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.SUB) {
					codigoDestinoExpressao += "dsub\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.MUL) {
					codigoDestinoExpressao += "dmul\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.DIV) {
					codigoDestinoExpressao += "ddiv\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.IGUAL) {
					codigoDestinoExpressao += "dcmpg\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.OU) {
					codigoDestinoExpressao += "ior\n";				
				}
				
				if(operador.getTipoOperador() == TipoOperador.CONCAT) {
			
					String concat = listaOperandoString.poll();
					concat += listaOperandoString.poll();
					
					codigoDestinoExpressao += "ldc " + "\"" + concat.replaceAll("\"", "") + "\"" + "\n";
					
				}
			
			}
			
			
		}
		
		return codigoDestinoExpressao;
	
	}

}
