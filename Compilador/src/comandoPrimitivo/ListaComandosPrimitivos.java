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
	
	public String geraCodigoDestinoTotal() throws IOException { //terceira passagem START
		String path = "C:\\arquivos_saida\\TESTE.txt";
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		//percorre a lista com todos os comandos primitivos do programa
		for(int i = 0; i < this.listaComandosPrimitivos.size(); i++) {
			//writer.write("numero"+i);
			String codigoDestino = this.listaComandosPrimitivos.get(i).geraCodigoDestino();
			if(!codigoDestino.equals("")) {
				writer.write(codigoDestino);
				writer.newLine();
			}
			
		}
		
		//Criando o conteúdo do arquivo
		writer.flush();
		//Fechando conexão e escrita do arquivo.
		writer.close();
		System.out.println("Arquivo gravado em: " + path);
		return "geraCodigoDestinoTotal";
	}
	
	public String toString() {
		return "ListaComandosPrimitivos:\n"+listaComandosPrimitivos.toString();
	}
}
