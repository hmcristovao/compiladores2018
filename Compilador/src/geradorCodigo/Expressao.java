package geradorCodigo;

import java.util.LinkedList;

import comando.primitivo.ListaComandosPrimitivos;
import parser.Compilador;
import semantico.Item;
import semantico.Operador;
import semantico.Operando;
import semantico.Simbolo;
import semantico.Tabela;
import semantico.TipoDado;
import semantico.TipoElemento;
import semantico.TipoOperador;

public class Expressao {
	public LinkedList<Item> listaExpInfixa;
	public LinkedList<Item> listaExpPosfixa;	
	static LinkedList<String> listaOperandoString =  new LinkedList<String>();
	
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
	
	 
	 public String geraCodigoDestino() {
		 	String codigoDestino = "";
		 	for(Item item : this.listaExpPosfixa) {
		 		if(item.getTipo().equals("Operando")) {
		 			Operando operando = (Operando)item;
		 			if(operando.getTipoDado() == TipoDado.NUM) {
						if(operando.getTipoElemento() == TipoElemento.CTE){
							codigoDestino += "ldc2_w " + Float.parseFloat(operando.getLexema()) + "\n";
						}
						if(operando.getTipoElemento() == TipoElemento.VAR){			
							int referencia = Compilador.tabela.consultaReferencia(operando.getLexema());
							if(referencia >= 4) {
								codigoDestino += "dload_" + referencia + "\n";
							}else {
								codigoDestino += "dload_" + referencia + "\n";
							}
						}
					}
					
					if(operando.getTipoDado() == TipoDado.STR) {
						if(operando.getTipoElemento() == TipoElemento.CTE){
							codigoDestino += "ldc " + operando.getLexema() + "\n";
							listaOperandoString.add(operando.getLexema());
						}
						
						if(operando.getTipoElemento() == TipoElemento.VAR){			
							int referencia = Compilador.tabela.consultaReferencia(operando.getLexema());						
							codigoDestino += "aload_" + referencia + "\n";
						}
					}
				}
					
				
				if(item.getTipo().equals("Operador")) {
					Operador operador = (Operador)item;
					if(operador.getTipoOperador() == TipoOperador.ADD) codigoDestino += "dadd\n";
					if(operador.getTipoOperador() == TipoOperador.SUB) codigoDestino += "dsub\n";
					if(operador.getTipoOperador() == TipoOperador.MUL) codigoDestino += "dmul\n";
					if(operador.getTipoOperador() == TipoOperador.DIV) codigoDestino += "ddiv\n";
					if(operador.getTipoOperador() == TipoOperador.IGUAL) codigoDestino += "dcmpg\n";
					if(operador.getTipoOperador() == TipoOperador.OU) codigoDestino += "ior\n";				
				
					
				}
			}
			return codigoDestino;
		}

	 public String toString() {
		String resultado = this.listaExpPosfixa.toString().replace("[", "");
		resultado = resultado.replace("]","");
		return resultado;
	 }
}
