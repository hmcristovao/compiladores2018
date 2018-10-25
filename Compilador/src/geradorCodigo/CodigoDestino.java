package geradorCodigo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import segundaPassagem.ListaComandosPrimitivos;

public class CodigoDestino {
	//private String codigoDestino;
	public CodigoDestino(ListaComandosPrimitivos listaComandos) {
        BufferedWriter arqSaida;
        try {
              arqSaida = new BufferedWriter(new FileWriter("prog_destino.j"));
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
              arqSaida.write(".limit stack 4\r\n");  
              arqSaida.write(".limit locals 100\r\n"); // máximo de variáveis locais (deve ser calculado)
              arqSaida.write(listaComandos.geraCodigoDestinoTotal());
              arqSaida.write("return\r\n");
              arqSaida.write(".end method\r\n");
              arqSaida.close();
        }
        catch(IOException e) {
              System.out.println("Problema no arquivo 'prog_destino.j'");
        }
        catch(Exception e) {
              System.out.println(e.getMessage());
        }
  }
}
