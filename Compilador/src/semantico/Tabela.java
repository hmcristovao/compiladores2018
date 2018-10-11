package semantico;

import java.util.HashMap;

import parser.Token;
import tratamentoErro.*;

import semantico.Simbolo;

public class Tabela {
	
	
	static HashMap<String, Simbolo> tab = new HashMap<String, Simbolo>();
	
	private static int marcador = 1; // armazena a última referência incluída na tabela
	
	
	public static int getMarcador() {
		return marcador;
	}

	public static void insereSimbolo(Simbolo simbolo) {
		tab.put(simbolo.getNome(), simbolo);
	}

	public static boolean verificaSimbolo(String chave) {
		return tab.containsKey(chave);
	}

	public int tamanhoTabela() {
		return tab.size();
	}
	
	public Simbolo pesquisaTabela(String chave) {
		return tab.get(chave);
	}
	
	public static void imprimeTabela(){
		System.out.println(tab);
	}
	
	public static TipoDado tipoVariavel(String chave) {
		TipoDado tipo = null;
		
		if(chave.equals("numero")) {
			tipo = TipoDado.NUMERO;
			
		}
		if(chave.equals("palavra")) {
			tipo = TipoDado.PALAVRA;
		}
		
		return tipo;
	}
	
	public static void incrementaMarcador(TipoDado tipo) {
		
		if(tipo == TipoDado.NUMERO) {
			
			marcador+=2;
		}
		if(tipo == TipoDado.PALAVRA) {
			marcador+=1;
		}
	}
	
	
	public static void insereNaTabela(Token variavel, TipoDado tipo) {
		 
		 if(tab.containsKey(variavel.image) == false) {
			  Simbolo simbolo = new Simbolo(variavel, tipo, getMarcador());
			  simbolo.setToken(variavel);
		  	  simbolo.setTipo(tipo);
		  	  
		  	  simbolo.setReferencia(getMarcador());
		  	  incrementaMarcador(tipo);
		  	  insereSimbolo(simbolo);
	  	  }else {
	  		throw new ErroSemantico("Variavel "+ variavel + " Duplicada");
	  	  }
	 }
	
	public static void verificaVariavelDeclarada(String variavel) {
		 if(tab.containsKey(variavel) == false) {
		  	  	throw new ErroSemantico ("Variavel "+ variavel + " nao declarada");
		 }
		 
	 }

}
