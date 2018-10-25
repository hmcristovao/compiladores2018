package apoio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AcoesSemanticas {

	public AcoesSemanticas() {
		
	}
	
	public static void gerarCodigoDestinoFinal (String nomeArquivo, String CodigoDestino) {
		try {
			File newFile = new File(nomeArquivo);
			newFile.createNewFile();
			BufferedWriter arqSaida = new BufferedWriter(new FileWriter(nomeArquivo));
			arqSaida.write(".source prog_destino.java\r\n");
			arqSaida.write(".class public prog_destino\n");
			arqSaida.write(".super java/lang/Object\n");
			arqSaida.write(".method public <init>()V\r\n");
	        arqSaida.write(".limit stack 1\n");
	        arqSaida.write(".limit locals 1\n");
	        arqSaida.write("aload_0\r\n");
	        arqSaida.write("invokespecial java/lang/Object/<init>()V\r\n");
	        arqSaida.write("return\n");
	        arqSaida.write(".end method\n\n");
	        arqSaida.write(".method public static main([Ljava/lang/String;)V\n");
	        arqSaida.write(".limit stack 100\n");
	        arqSaida.write(".limit locals 100\r\n");
	        arqSaida.write(CodigoDestino);
	        arqSaida.write("return\n");
	        arqSaida.write(".end method\n");
	        arqSaida.flush();
	        arqSaida.close();
	        
	        System.out.println("Arquivo Criado");
			
		}
		catch  (IOException e){
			System.out.println("Erro");
		}
	}

}
