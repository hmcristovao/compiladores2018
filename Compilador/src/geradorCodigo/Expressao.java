package geradorCodigo;

import java.util.LinkedList;

import comando.primitivo.ListaComandosPrimitivos;
import semantico.Item;
import semantico.Operador;
import semantico.Operando;
import semantico.Simbolo;
import semantico.Tabela;
import semantico.TipoDado;
import semantico.TipoElemento;

public class Expressao {
	public LinkedList<Item> listaExpInfixa;
	public LinkedList<Item> listaExpPosfixa;	
	
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
	 
	 public String geraCodigoDestino(ListaComandosPrimitivos _lista) {
		 String codExpressao = "";
			
			for(int i = 0; i < this.listaExpPosfixa.size(); i++) {
				if(i < this.listaExpPosfixa.size()-2 && this.listaExpPosfixa.get(i+2) instanceof Operador && this.listaExpPosfixa.get(i+2).getLexema().equals("&")) {
						i+=2;
						Operando op1, op2;
						op1 = (Operando)this.listaExpPosfixa.get(i-2);
						op2 = (Operando)this.listaExpPosfixa.get(i-1);
						
						codExpressao+="new java/lang/StringBuilder\r\n" + "dup\r\n" + "invokespecial java/lang/StringBuilder/<init>()V\r\n";
						
						if(op1.get_tipoElemento() == TipoElemento.CTE) { 
							if(op1.getTipoDado() == TipoDado.NUM) { 
								Double numero = Double.parseDouble(op1.getLexema());
								codExpressao+="ldc2_w "+numero+"\r\n";
							}
							
							if(op1.getTipoDado() == TipoDado.STR) {
								codExpressao+="ldc "+op1.getLexema()+"\r\n";
							}
						}
						
						if(op1.get_tipoElemento() == TipoElemento.VAR) {
							Simbolo simbolo = Tabela.tabela.get(op1.getLexema());
							if(op1.getTipoDado() == TipoDado.NUM) {
								codExpressao+="dload "+simbolo.getReferencia()+"\r\n";
							}
							
							if(op1.getTipoDado() == TipoDado.STR) { 
								codExpressao+="aload "+simbolo.getReferencia()+"\r\n";
							}
						}
						
						codExpressao += "invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\r\n";
						
						if(op2.get_tipoElemento() == TipoElemento.CTE) { 
							if(op2.getTipoDado() == TipoDado.NUM) {
								Double numero = Double.parseDouble(op2.getLexema());
								codExpressao+="ldc2_w " + numero + "\r\n";
							}
							
							if(op2.getTipoDado() == TipoDado.STR) { 
								codExpressao+="ldc "+op2.getLexema() + "\r\n";
							}
						}
						
						if(op2.get_tipoElemento() == TipoElemento.VAR) {
							Simbolo simbolo = Tabela.tabela.get(op2.getLexema());
							if(op2.getTipoDado() == TipoDado.NUM) { 
								codExpressao+="dload "+simbolo.getReferencia()+"\r\n";
							}
							
							if(op2.getTipoDado() == TipoDado.STR) { 
								codExpressao+="aload "+simbolo.getReferencia()+"\r\n";
							}
						}
						codExpressao += "invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;\r\n"
								+ "invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;\r\n";
						codExpressao += ";fim concatenacao\n";
						continue;
				}
				
				if(this.listaExpPosfixa.get(i) instanceof Operando) {
					Operando operando = (Operando) this.listaExpPosfixa.get(i);
					if(operando.get_tipoElemento() == TipoElemento.CTE) {
						if(operando.getTipoDado() == TipoDado.NUM) { 
							Double numero = Double.parseDouble(operando.getLexema());
							codExpressao+="ldc2_w "+numero+"\r\n";
						}
						
						if(operando.getTipoDado() == TipoDado.STR) {
							codExpressao+="ldc "+operando.getLexema()+"\r\n";
						}
					}
					
					if(operando.get_tipoElemento() == TipoElemento.VAR) { 
						Simbolo simbolo = Tabela.tabela.get(operando.getLexema());
						if(operando.getTipoDado() == TipoDado.NUM) { 
							codExpressao+="dload "+simbolo.getReferencia()+"\r\n";
						}
						
						if(operando.getTipoDado() == TipoDado.STR) { 
							codExpressao+="aload "+simbolo.getReferencia()+"\r\n";
						}
					}
				}
				
				if(this.listaExpPosfixa.get(i) instanceof Operador) {
					Operador operador = (Operador) this.listaExpPosfixa.get(i);
					if(operador.getLexema().equals("+")) {
						codExpressao+="dadd\r\n";
					}
					
					if(operador.getLexema().equals("-")) { 
						codExpressao+="dsub\r\n";
					}
					
					if(operador.getLexema().equals("*")) { 
						codExpressao+="dmul\r\n";
					}
					
					if(operador.getLexema().equals("/")) { 
						codExpressao+="ddiv\r\n";
					}
					
					if(operador.getLexema().equals("|")) {
						codExpressao+=";begin ou logico\n"
						/*		+"dup\r\n"
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
								+ "FIM_"+idExpressao+ ": nop\r\n"*/
								+ ";end ou logico\n";
					}
					if(operador.getLexema().equals("=")) { //igual(comparação lógica)
						codExpressao+=";begin igual logico\n"
								+ "dcmpg\r\n"
								+ ";end igual logico\n";
					}
				}
			}
			
			return codExpressao;
		}
	 
	 
	 public String toString() {
		return this.listaExpPosfixa.toString();
	 }
}
