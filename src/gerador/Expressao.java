package gerador;

import java.util.LinkedList;

import parser.Compilador;
import semantico.Simbolo;
import semantico.TipoDado;

public class Expressao {
	public LinkedList<Item> expressaoInfixa;
	public LinkedList<Item> expressaoPosfixa;
	private static Integer contLabel = 0;
	

	public Expressao() {
		expressaoInfixa = new LinkedList<Item>();
        expressaoPosfixa = new LinkedList<Item>();
		
	}
	
	public LinkedList<Item> getExpressaoInfixa(){
		return this.expressaoInfixa;
	}
	
	public LinkedList<Item> getExpressaoPosfixa(){
		return this.expressaoPosfixa;
	}
	
    public void addItemInfixo(Item _item) {
        expressaoInfixa.add(_item);
    }

    public void addItemPosfixo(Item _item) {
        expressaoPosfixa.add(_item);
    }
    
    public TipoDado getTipoDado() {
    	return null;
    }
    
    
    public String geraCodigoDestino() {
    	String concatenacao = "";
        String codigoCodigoDestino = "";
        
        for(Item item : this.getExpressaoPosfixa()) {
        	if (item instanceof Operador) {
        		Operador op = (Operador) item;
        		
        		if(op.getTipoOperador() == TipoOperador.ADD) {
        			codigoCodigoDestino += "dadd\n";
        		}
        		else if (op.getTipoOperador() == TipoOperador.SUB) {
        			codigoCodigoDestino += "dsub\n";
        		}
        		else if (op.getTipoOperador() == TipoOperador.MUL) {
        			codigoCodigoDestino += "dmul\n";
        		}
        		else if (op.getTipoOperador() == TipoOperador.DIV) {
        			codigoCodigoDestino += "ddiv\n";
        		}
        		else if (op.getTipoOperador() == TipoOperador.OU) {
        			codigoCodigoDestino += "ior\n";
        		}
        		else if (op.getTipoOperador() == TipoOperador.IGUAL) {
        			codigoCodigoDestino += "dcmpg\n";
        			codigoCodigoDestino+="ifeq LABEL_0"+contLabel+ "\r\n";
        			codigoCodigoDestino+="dconst_0 \r\n";
        			codigoCodigoDestino+="goto LABEL_0"+(contLabel+1) +"\r\n";
        			codigoCodigoDestino+= ("LABEL_0"+contLabel + ":\r\n");
        			codigoCodigoDestino+="dconst_1 \r\n";
        			codigoCodigoDestino+="LABEL_0"+(contLabel+1) + ":\r\n";
        			contLabel+=2;
        		}
        		else if (op.getTipoOperador() == TipoOperador.CONCAT) {
        			codigoCodigoDestino += "";
        		}
        	}
        	else if (item instanceof Operando ) {
        		Operando op = (Operando) item;
        		
        		if(op.getTipoElemento() == TipoElemento.CTE) {
        			if(op.getTipoDado() == TipoDado.NUM) {
        				Double aux = Double.parseDouble(op.getLexema());
        				codigoCodigoDestino += "ldc2_w " +aux+"\r\n";
        			}
        			else if (op.getTipoDado() == TipoDado.STR) {
        				String aux = op.getLexema();
        				codigoCodigoDestino += "ldc "+aux+"\r\n";
        				
        			}
        		}
        		else if(op.getTipoElemento() == TipoElemento.VAR) {
        			int referencia = Compilador.tabela.consultaReferencia(op.getLexema());
        			if(op.getTipoDado() == TipoDado.NUM) {
        				codigoCodigoDestino += "dload "+referencia+"\r\n";
        			}
        			else if (op.getTipoDado() == TipoDado.STR) {
        				codigoCodigoDestino += "aload "+referencia+"\r\n";
        			}        			
        		}        	

        	}
        	
        }
        
        return codigoCodigoDestino;
    }
    
    public String toString() {
        return "\nExpressao Posfixa: " + this.expressaoPosfixa.toString()
        	 + "\nExpressao Infixa: " + this.expressaoInfixa.toString();
}

}
