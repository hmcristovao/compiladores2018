package comandoPrimitivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ListaComandosPrimitivos {
	LinkedList<ComandoPrimitivo> listaComandosPrimitivos;
	
	public ListaComandosPrimitivos() {
		listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
	}

	public void addComando(ComandoPrimitivo comando) {
		this.listaComandosPrimitivos.add(comando);
	}
	
	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos(){
		return this.listaComandosPrimitivos;
	}
	
	public String geraCodigoDestinoTotal(){ //terceira passagem START
		String stringCodigoTotal = "";
		//percorre a lista com todos os comandos primitivos do programa
		for(int i = 0; i < this.listaComandosPrimitivos.size(); i++) {
			//writer.write("numero"+i);
			String codigoDestino = this.listaComandosPrimitivos.get(i).geraCodigoDestino();
			if(!codigoDestino.equals("")) {
				stringCodigoTotal+=codigoDestino;
				stringCodigoTotal+="\r\n";
			}
		}
		return stringCodigoTotal;
	}
	
	public String toString() {
		return "ListaComandosPrimitivos:\n"+listaComandosPrimitivos.toString();
	}
}
