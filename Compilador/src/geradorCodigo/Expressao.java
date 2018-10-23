package geradorCodigo;
import semantico.*;
import java.util.LinkedList;
import parser.*;

public class Expressao {
	public LinkedList<Item> listaExpInfixa = new LinkedList<Item>();
	public LinkedList<Item> listaExpPosfixa = new LinkedList<Item>();

   void addItemPosfixo(Item _item) {
	      this.listaExpPosfixa.add(_item);
   }
   
   public String geraCodigoDestino() {
	   String saida = "";
	   for(int i = 0; i<this.listaExpPosfixa.size(); i++) {
		   
		   //Item na posicao i da lista posfixa
		   Item item = this.listaExpPosfixa.get(i);
		   
		   //verifica se é Operando ou Operador
		   if(item.getLexema().equals("Operando")) {
			   
			   Operando op = (Operando)item;
			   
			   //Numeros
			   if(op.getTipoDado().equals(TipoDado.NUM)) {
					   
					   //Constantes
					   if(op.getTipoElemento().equals(TipoElemento.CTE)) {
						   saida += "ldc2_w " + op.token.image + ".0\r\n";
					   }
					   //Variaveis
					   else if(op.getTipoElemento().equals(TipoElemento.VAR)){
						   
						   int refVar = Compilador.tabela.consultaReferencia(op.token.image);
						   saida+= "dload " + refVar + "\r\n";
					   }
			   }
				   
			   else if(op.getTipoDado().equals(TipoDado.STR)) {
				   saida += "ldc" + op.token.image + "\r\n";
			   }
		   }
		   //Operadores
		   else if(item.getLexema().equals("Operador")){
			   
			   Operador opdr = (Operador)item;
			   
			   if(opdr.getTipoOperador().equals(TipoOperador.ADD)) {
				   saida += "dadd\r\n";
			   }
		   		else if(opdr.getTipoOperador().equals(TipoOperador.SUB)){
				   saida += "dsub\r\n";
			   }
		   		else if(opdr.getTipoOperador().equals(TipoOperador.MUL)){
				   saida += "dmul\r\n";
			   }
			   else if(opdr.getTipoOperador().equals(TipoOperador.DIV)){
				   saida += "ddiv\r\n";
			   }
			   else if(opdr.getTipoOperador().equals(TipoOperador.OR)){
				   saida += "ior\r\n";
			   }
			   else if(opdr.getTipoOperador().equals(TipoOperador.COMP)){
				   saida += "dcmpg\r\n";
			   }
		   }
	   
	   }
	   return saida;
   }
}
