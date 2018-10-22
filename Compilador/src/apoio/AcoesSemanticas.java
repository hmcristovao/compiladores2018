package apoio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import comando.ComandoAtribuicao;
import comando.ListaComandosAltoNivel;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Tabela;
import semantico.TipoDado;

public class AcoesSemanticas {
	
	public static void addAtribuicaoVariavel(ListaComandosAltoNivel comandos, Token t, Token v, Tabela tab, Expressao exp) {		
		//caso a variavel declarada não tenha sido adicionada a tabela de simbolos ainda, adiciona
		if(Tabela.tab.containsKey(v.image) == false) {
			System.out.println("variavel não declarada: "+v.image);
			addVariavelDeclarada(t, v, tab);
		}
		
		ComandoAtribuicao comandoAtribuicao;
		if(exp != null) {
			comandoAtribuicao = new ComandoAtribuicao(v, tab.consultaSimbolo(v.image), exp);
		}
		else {
			comandoAtribuicao = new ComandoAtribuicao(v, tab.consultaSimbolo(v.image), null);
		}
		comandos.addComando(comandoAtribuicao);
	}
	
	public static void addVariavelDeclarada(Token t, Token v, Tabela tab) {
		//adiciona uma variavel a tabela de simbolos		
		if (t.image.equals("numero")) { 
			tab.incluiSimbolo(v, TipoDado.NUM); 
		}else{ 
			tab.incluiSimbolo(v, TipoDado.STR); 
		}
	}
	
	public static void geraCodigo3Passagem(String pathSaida, String codigo)  throws IOException {
		String path = pathSaida;
		
		File newFile = new File(path);
		newFile.createNewFile(); // if file already exists will do nothing
		
		BufferedWriter arqSaida = new BufferedWriter(new FileWriter(path));
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
        arqSaida.write(codigo);
        arqSaida.write("return\r\n");
        arqSaida.write(".end method\r\n");
		//Criando o conteúdo do arquivo
        arqSaida.flush();
		//Fechando conexão e escrita do arquivo.
        arqSaida.close();
		System.out.println("Arquivo gravado em: " + path);
	}
}
