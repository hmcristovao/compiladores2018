package geradorCodigo;
import java.util.LinkedList;

import parser.Compilador;
import semantico.*;

public class Expressao {
	public LinkedList<Item> expressaoInfixa;
	public LinkedList<Item> expressaoPosfixa;
	
	public Expressao() {
		expressaoInfixa  = new LinkedList<Item>();
		expressaoPosfixa  = new LinkedList<Item>();
		
	}
	
	public void addItemPoxfixo(Item novo) {
		expressaoPosfixa.add(novo);
	}
	
	public String toString() {
		return this.expressaoPosfixa.toString();
	}
	
	
	public void imprime() {
		System.out.println(this.expressaoPosfixa);
	}
	
	public String geraCodigoDestino() {
		String saida = "";
		for(int i = 0 ; i < expressaoPosfixa.size(); i++ ) {
			if(this.expressaoPosfixa.get(i) instanceof Operador) {
				Operador op = (Operador)this.expressaoPosfixa.get(i);
				if( op.getTipoOperador() == TipoOperador.ADD )
					saida+="dadd\r\n";
				else if ( op.getTipoOperador() == TipoOperador.SUB )
					saida+="dsub\r\n";
				else if ( op.getTipoOperador() == TipoOperador.MUL )
					saida+="dmul\r\n";
				else if ( op.getTipoOperador() == TipoOperador.DIV )
					saida+="ddiv\r\n";
				else if ( op.getTipoOperador() == TipoOperador.IGUAL )
					saida+="igual";
				else if ( op.getTipoOperador() == TipoOperador.OR )
					saida+="ou";
			}else if (this.expressaoPosfixa.get(i) instanceof Operando){
				Operando op = (Operando)this.expressaoPosfixa.get(i);
				if( op.getTipoElemento() == TipoElemento.CTE) {
					if( op.getTipoDado() == TipoDado.NUMERO ) {
						Double num = Double.parseDouble(op.getLexema());
						saida+="ldc2_w "+num+"\r\n";
					}else if ( op.getTipoDado() == TipoDado.PALAVRA ) {
						saida+="ldc "+op.getLexema()+"\r\n";
					}
				}else if ( op.getTipoElemento() == TipoElemento.VAR ) {
					Simbolo simb = Compilador.tabela.consultaSimbolo(op.getLexema());
					if( op.getTipoDado() == TipoDado.NUMERO)
						saida+="dload "+simb.getReferencia()+"\r\n";
					else if ( op.getTipoDado() == TipoDado.PALAVRA ) 
						saida+="aload "+simb.getReferencia()+"\r\n";
				}
			}
		}
		
		return saida;
	}
	
}