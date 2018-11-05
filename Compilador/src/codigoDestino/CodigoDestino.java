package codigoDestino;

import java.io.*;

import apoio.Config;
import comandoPrimitivo.ListaComandosPrimitivos;
import parser.Compilador;

public class CodigoDestino {
	
	StringBuilder codigo;
	
	public CodigoDestino(ListaComandosPrimitivos listaComandosPrimitivos) {
		this.codigo = new StringBuilder();
		this.codigo.append(".source prog_destino.java \r\n");
		this.codigo.append(".class public "+Config.nomeArquivo + "\r\n");
		this.codigo.append(".super java/lang/Object \r\n");
		this.codigo.append(".method public <init>()V \r\n");
		this.codigo.append(".limit stack 1 \r\n");
		this.codigo.append(".limit locals 1 \r\n");
		this.codigo.append("aload_0 \r\n");
		this.codigo.append("invokespecial java/lang/Object/<init>()V \r\n");
		this.codigo.append("return \r\n");
		this.codigo.append(".end method \r\n\r\n");
		
		this.codigo.append(".method public static main([Ljava/lang/String;)V \r\n");
		this.codigo.append(".limit stack 100 \r\n");  // deve ser calculado!!!
		this.codigo.append(".limit locals " + (Compilador.tabela.getMarcador()+2) +"\r\n"); 
		
		this.codigo.append(listaComandosPrimitivos.geraCodigoDestinoTotal());
		
		this.codigo.append("return \r\n");
		this.codigo.append(".end method \r\n");
	}
	
	public void geraArquivo(String nomeArquivo) throws IOException {
		File newFile = new File(nomeArquivo);
		newFile.createNewFile();
		
		BufferedWriter arqSaida = new BufferedWriter(new FileWriter(newFile));
		arqSaida.write(this.codigo.toString());
		arqSaida.flush();
	    arqSaida.close();    
	}

	public String toString() {
		return this.codigo.toString();
	}
	
}

