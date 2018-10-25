package geradorCodigo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import parser.Compilador;

public class GeradorCodigoDestino  {
      public static void geraCodigoAssembler(String _lista, String _caminho) throws IOException  {
    	  try {  
		    	  BufferedWriter arqSaida;
		    	  File newFile = new File(_caminho);
		    	  newFile.createNewFile(); // if file already exists will do nothing
		          arqSaida = new BufferedWriter(new FileWriter(_caminho));
		          arqSaida.write(".source prog_destino.java\r\n");
		          arqSaida.write(".class public prog_destino\r\n");
                  arqSaida.write(".super java/lang/Object\r\n");
                  arqSaida.write(".method public <init>()V\r\n");
                  arqSaida.write(".limit stack 1\r\n");
                  arqSaida.write(".limit locals 1\r\n");
                  arqSaida.write("aload_0\r\n");
                  arqSaida.write("invokespecial java/lang/Object/<init>()V\r\n");
                  arqSaida.write("return\r\n");
                  arqSaida.write(".end method\r\n");
                  arqSaida.write(".method public static main([Ljava/lang/String;)V\r\n");
                  arqSaida.write(".limit stack 400 \r\n");  
                  arqSaida.write(".limit locals " + (Compilador.tabela.getMarcador()+2) + "\r\n"); 
                  arqSaida.write(_lista);
                  arqSaida.write("return\r\n");
                  arqSaida.write(".end method\r\n");
                  arqSaida.flush();
                  arqSaida.close();
                  System.out.println("Arquivo criado com sucesso!!");
			} catch (IOException e) {
				System.out.println("Erro ao criar arquivo !!" + e);
			}
        }
  
}