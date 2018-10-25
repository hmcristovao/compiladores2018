package geradorCodigo;

import java.io.*;

import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Compilador;

public class CodigoDestino {
	
	public void geraArquivo(String nome, ListaComandosPrimitivos listaComandosPrimitivos){
		
		try {
			File newFile = new File(nome);
			newFile.createNewFile();
		
			BufferedWriter arqSaida = new BufferedWriter(new FileWriter(nome));
			arqSaida.write(".source prog_destino.java\n");
	        arqSaida.write(".class public prog_destino\n");
	        arqSaida.write(".super java/lang/Object\n");
	        arqSaida.write(".method public <init>()V\n");
	        arqSaida.write(".limit stack 1\n");
	        arqSaida.write(".limit locals 1\n");
	        arqSaida.write("aload_0\n");
	        arqSaida.write("invokespecial java/lang/Object/<init>()V\n");
	        arqSaida.write("return\n");
	        arqSaida.write(".end method\n\n");
	        arqSaida.write(".method public static main([Ljava/lang/String;)V\n");
	        arqSaida.write(".limit stack 4\n");  
	        arqSaida.write(".limit locals" + (Compilador.tabela.getMarcador()+2) +"\n"); 
	        arqSaida.write(listaComandosPrimitivos.geraCodigoDestinoCompleto());
	        arqSaida.write("return\n");
	        arqSaida.write(".end method\n");
	        arqSaida.flush();
	        arqSaida.close();
	        System.out.println("Arquivo criado com sucesso!!");
        
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo !!" + e);
		}
	}
}

