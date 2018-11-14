package semantico;

import java.util.LinkedList;
import codigoDestino.*;
import comandoPrimitivo.*;
import parser.Compilador;

public class Expressao {

	LinkedList<Item> listaExpInfixa;
	LinkedList<Item> listaExpPosFixa;
	public int tam = 0;

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

	// o tipo da expressao eh igual ao tipo do primeiro elemento posfixo (que deve ser um operando)
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
					//calculo da stack
					CodigoDestino.tamanhoPilha += 2;
					if(CodigoDestino.tamanhoPilha > CodigoDestino.tamanhoTotalPilha)
						CodigoDestino.tamanhoTotalPilha = CodigoDestino.tamanhoPilha;
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
					//calculo da stack
					CodigoDestino.tamanhoPilha += 1;
					if(CodigoDestino.tamanhoPilha > CodigoDestino.tamanhoTotalPilha)
						CodigoDestino.tamanhoTotalPilha = CodigoDestino.tamanhoPilha;
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
				
				if(operador.getTipoOperador() == TipoOperador.OU) {
					PrimitivoLabel labelSAIDA = new PrimitivoLabel("SAIDA");

					codigoDestinoExpressao += "dconst_0 \r\n"	//Primeiro empilha 0 e compara com a expressao
					+"dcmpg \r\n"								//se o resultado for igual, quer dizer que
					+"ifeq " + labelSAIDA.getLabel()			//a expressao eh falsa, portanto deve sair
					+"pop2 \r\n"	
					+"dconst_1 \r\n"							//Sendo a expressao verdadeira, basta desempilhar 
					+ labelSAIDA.geraCodigoDestino();			//a expressao e empilhar 1 como resultado valido
					
				}
				
				if(operador.getTipoOperador() == TipoOperador.E) {
					PrimitivoLabel labelSAIDA = new PrimitivoLabel("SAIDA");
					
					codigoDestinoExpressao += "dconst_1 \r\n"			//Primeiro empilha 1 e compara com o topo
							+"dcmpg \r\n"								//se o resultado for igual, quer dizer que 
																		//o segundo que decide o resultado
							+"ifeq " + labelSAIDA.getLabel()			//portanto deve sair
							+"pop2 \r\n"								//se nao for 1, ele desempilha e empilha 0
							+"dconst_0 \r\n"							//Sai
							+ labelSAIDA.geraCodigoDestino();			
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
				
				//Analogo ao caso igual, porem diferenciado no uso do iflt que pega se for menor
				//que eh o caso do do operador relacional menor 
				if(operador.getTipoOperador() == TipoOperador.MENOR) {
					PrimitivoLabel labelCOLOCATRUE = new PrimitivoLabel("COLOCATRUE");
					PrimitivoLabel labelSAIDA = new PrimitivoLabel("SAIDA");
					
					codigoDestinoExpressao += "dcmpg \r\n"
							+ "iflt "+labelCOLOCATRUE.getLabel() 
							+ "dconst_0 \r\n"
							+ "goto "+labelSAIDA.getLabel()
							+ labelCOLOCATRUE.geraCodigoDestino()
							+ "dconst_1 \r\n"
							+ labelSAIDA.geraCodigoDestino();
				}
				
				//compara e se for maior ou igual, entao eh verdadeiro e empilha 0
				//caso falso, empilha 1 e sai do programa
				if(operador.getTipoOperador() == TipoOperador.MAIORIGUAL) {
					PrimitivoLabel labelCOLOCATRUE = new PrimitivoLabel("COLOCATRUE");
					PrimitivoLabel labelSAIDA = new PrimitivoLabel("SAIDA");
					
					codigoDestinoExpressao += "dcmpg \r\n"
							+ "ifge " + labelCOLOCATRUE.getLabel() 
							+ "dconst_0 \r\n"
							+ "goto "+labelSAIDA.getLabel()
							+ labelCOLOCATRUE.geraCodigoDestino()
							+ "dconst_1 \r\n"
							+ labelSAIDA.geraCodigoDestino();
				}
				
				//calculo da stack
				CodigoDestino.tamanhoPilha -= 2;
			}			
		}		
		return codigoDestinoExpressao;	
	}

	public String toString() {
		return "[infixa: "+this.getListaExpInfixa() +
				"]; posfixa: ["+this.getListaExpPosFixa()+"]";
	}
}
