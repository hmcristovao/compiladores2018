package semantico;

import java.util.LinkedList;

import comandoPrimitivo.*;
import parser.Compilador;

public class Expressao {
	
	LinkedList<Item> listaExpInfixa;
	LinkedList<Item> listaExpPosFixa;
	
	static LinkedList<String> listaOperandoString =  new LinkedList<String>();
	
	public Expressao() {
		this.listaExpInfixa = new LinkedList<Item>();
		this.listaExpPosFixa = new LinkedList<Item>();
	}
	
	public LinkedList<Item> getListaExpInfixa() {
		return this.listaExpInfixa;
	}
	public LinkedList<Item> getListaExpPosFixa() {
		return this.listaExpPosFixa;
	}

	// o tipo da expressao é igual ao tipo do primeiro elemento posfixo (que deve ser um operando)
	public TipoDado getTipo() {
		return ((Operando)(this.listaExpPosFixa.getFirst())).tipoDado;
	}
	
	public void addListaExpInfixa(Item item) {
		this.listaExpInfixa.add(item);
	}
	public void addListaExpPosFixa(Item item) {
		this.listaExpPosFixa.add(item);
	}
	
	public void imprimeExpressao() {
		System.out.println(this.listaExpPosFixa);
	}
	
	public String geraCodigoDestino(){
		
		String codigoDestinoExpressao = "";
		for(Item item : this.listaExpPosFixa) {
			// se for operando
			if(item instanceof Operando) {
				Operando operando = (Operando)item;
				// se for numero
				if(operando.getTipoDado() == TipoDado.NUMERO) {
					if(operando.getTipoElemento() == TipoElemento.CTE){
						codigoDestinoExpressao += "ldc2_w " + operando.getLexema() + "\r\n";
					}
					if(operando.getTipoElemento() == TipoElemento.VAR){
						int referencia = Compilador.tabela.pesquisaTabela(operando.getLexema()). getReferencia();
						if(referencia >= 4) {
							codigoDestinoExpressao += "dload " + referencia + "\r\n";
						}else {
							codigoDestinoExpressao += "dload_" + referencia + "\r\n";
						}
					}
				}
				// se for string
				if(operando.getTipoDado() == TipoDado.PALAVRA) {
					if(operando.getTipoElemento() == TipoElemento.CTE){
						codigoDestinoExpressao += "ldc " + operando.getLexema() + "\r\n";
				}
					if(operando.getTipoElemento() == TipoElemento.VAR){
						int referencia = Compilador.tabela.pesquisaTabela(operando.getLexema()).getReferencia();						
						codigoDestinoExpressao += "aload " + referencia + "\r\n";
					}
				}
			}
			// se for operador
			if(item instanceof Operador) {
				Operador operador = (Operador)item;
			
				if(operador.getTipoOperador() == TipoOperador.SOMA) {
					codigoDestinoExpressao += "dadd \r\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.SUB) {
					codigoDestinoExpressao += "dsub \r\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.MUL) {
					codigoDestinoExpressao += "dmul \r\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.DIV) {
					codigoDestinoExpressao += "ddiv \r\n";
				}
				
				if(operador.getTipoOperador() == TipoOperador.IGUAL) {
					PrimitivoLabel labelCOLOCATRUE = new PrimitivoLabel("COLOCATRUE");
					PrimitivoLabel labelSAIDA = new PrimitivoLabel("SAIDA");
					
					codigoDestinoExpressao += "dcmpg \r\n"
							                + "ifeq "+labelCOLOCATRUE.getLabel() 
							                + "dconst_0 \r\n"
							                + "goto "+labelSAIDA.getLabel()
							                + labelCOLOCATRUE.geraCodigoDestino()
							                + "dconst_1 \r\n"
							                + labelSAIDA.geraCodigoDestino();
				}
			}			
		}		
		return codigoDestinoExpressao;	
	}
	
	public String toString() {
		return "[infixa: "+this.getListaExpInfixa() +
				"]; posfixa: ["+this.getListaExpPosFixa()+"]";
	}
}
