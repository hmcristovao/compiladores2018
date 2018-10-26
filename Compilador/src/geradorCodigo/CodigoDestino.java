package geradorCodigo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import apoio.*;
import parser.*;
import semantico.*;
import comando.*;

public class CodigoDestino implements Config
{	
	 private static int limitePilha = 90;
	 private static int limiteVariaveisLocais = 100;
	 private static int referenciaVariavelTemporaria = limitePilha - 10;
	 
	 public static void geraCodigoAssembler(ListaComandosPrimitivos listaComandos) 
	 {
         BufferedWriter arqSaida;
         try {
               arqSaida = new BufferedWriter(new FileWriter( pacoteExemplos + nomeArquivoAssembler + extensaoSegPassagem));
               arqSaida.write(".source " + nomeArquivoAssembler +".java\r\n");
               arqSaida.write(".class public "+ nomeArquivoAssembler +"\r\n");
               arqSaida.write(".super java/lang/Object\r\n");
               arqSaida.write(".method public <init>()V\r\n");
               arqSaida.write(".limit stack " + CodigoDestino.getLimitePilha() + "\r\n");
               arqSaida.write(".limit locals "+ CodigoDestino.getLimiteVariaveisLocais() + "\r\n");
               arqSaida.write("aload_0\r\n");
               arqSaida.write("invokespecial java/lang/Object/<init>()V\r\n");
               arqSaida.write("return\r\n");
               arqSaida.write(".end method\r\n");
               arqSaida.write(".method public static main([Ljava/lang/String;)V\r\n");
               arqSaida.write(".limit stack " + CodigoDestino.getLimitePilha() + "\r\n");
               arqSaida.write(".limit locals "+ CodigoDestino.getLimiteVariaveisLocais() + "\r\n"); 
               arqSaida.write(processaListaComandos(listaComandos).toString());
               arqSaida.write("return\r\n");
               arqSaida.write(".end method\r\n");
               arqSaida.close();
         }
         catch(IOException e) 
         {
               System.out.println("Problema ao gerar arquivo " + nomeArquivoAssembler + extensaoSegPassagem + "\n");
         }
         catch(Exception e) 
         {
               System.out.println(e.getMessage());
         }
   }
   
   public static StringBuilder processaListaComandos(ListaComandosPrimitivos listaComandosPrimitivos) 
   {
		 StringBuilder codigoDestino = new StringBuilder();
 		
		for (ComandoPrimitivo comandoPrimitivo : listaComandosPrimitivos.getListaComandosPrimitivos() ) 
		{
			codigoDestino.append( comandoPrimitivo.geraCodigoDestino() );
			codigoDestino.append("\n");
		}
 		
 		return codigoDestino;
   }
   
   public static int getReferenciaVariavelTemporaria()
   {
	   return CodigoDestino.referenciaVariavelTemporaria;
   }

	public static int getLimitePilha() 
	{
		return CodigoDestino.limitePilha;
	}
	
	public static void setLimitePilha(int _limitePilha) 
	{
		CodigoDestino.limitePilha = _limitePilha;
	}
	
	public static int getLimiteVariaveisLocais() 
	{
		return limiteVariaveisLocais;
	}
	
	public static void setLimiteVariaveisLocais(int _limiteVariaveisLocais) 
	{
		CodigoDestino.limiteVariaveisLocais = _limiteVariaveisLocais;
	}
	
	public static void setReferenciaVariavelTemporaria(int _referenciaVariavelTemporaria) 
	{
		CodigoDestino.referenciaVariavelTemporaria = _referenciaVariavelTemporaria;
	}
	
	public static int referenciaTemporaria( TipoDado _tipoDado )
	{
		int ref = CodigoDestino.getReferenciaVariavelTemporaria();
		// Seta a referência temporária com base no tamanho do tipo definido na tabela
		CodigoDestino.setReferenciaVariavelTemporaria( ref + Compilador.tabela.incrementoReferencia(_tipoDado) );
		return ref;
	}
   
	public static void liberarReferenciaTemporaria( TipoDado _tipoDado )
	{
		CodigoDestino.setReferenciaVariavelTemporaria( CodigoDestino.getReferenciaVariavelTemporaria() - Compilador.tabela.incrementoReferencia(_tipoDado));
	}
   
   
}

