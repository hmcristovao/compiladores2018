package primitivo;
import java.util.LinkedList;

import comandos.ComandoAltoNivel;

public class ListaComandosPrimitivos {
	public LinkedList<ComandoPrimitivo> listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
	
	
	public ListaComandosPrimitivos() {
		// TODO Auto-generated constructor stub
	}
	
	public void addComando(ComandoPrimitivo cmd) {
		if(cmd!=null)this.listaComandosPrimitivos.add(cmd);
	}
	
	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos(){
		return this.listaComandosPrimitivos;
	}
	
	public String geraCodigoDestinoTotal() {
		String saida = "";
		saida+=".source prog_destino.java\r\n"
        +".class public prog_destino\r\n"
        +".super java/lang/Object\r\n"
        +".method public <init>()V\r\n"
        +".limit stack 1\r\n"
        +".limit locals 1\r\n"
        +"aload_0\r\n"
        +"invokespecial java/lang/Object/<init>()V\r\n"
        +"return\r\n"
        +".end method\r\n"
        +".method public static main([Ljava/lang/String;)V\r\n"
        +".limit stack 4\r\n"
        +".limit locals 100\r\n"; // máximo de variáveis locais (deve ser calculado)
        for(int i=0; i<this.listaComandosPrimitivos.size(); i++) {
			saida += this.listaComandosPrimitivos.get(i).geraCodigoDestino();
		}
        saida+="return\r\n"
        +".end method\r\n";
        
		
		return saida;
	}
	
	public String toString() {
		return "" + this.listaComandosPrimitivos;
	}
	
}
