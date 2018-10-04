package semantico;

import java.util.HashMap;
import tratamentoErro.*;

import semantico.Simbolo;

public class Tabela {
	
	
	static HashMap<String, Simbolo> tab = new HashMap<String, Simbolo>();
	
	private static int marcador = 1; // armazena a última referência incluída na tabela
	
	
	public static int getMarcador() {
		return marcador;
	}

	public void insereSimbolo(Simbolo simbolo) {
		tab.put(simbolo.getNome(), simbolo);
	}

	public boolean verificaSimbolo(String chave) {
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
			tipo = tipo.NUMERO;
			
		}
		if(chave.equals("palavra")) {
			tipo = tipo.PALAVRA;
		}
		
		return tipo;
	}
	
	public static void incrementaMarcador(String tipo) {
		
		if(tipo.equals("numero")) {
			
			marcador+=2;
		}
		if(tipo.equals("palavra")) {
			marcador+=1;
		}
	}
	
	
	public static void insereNaTabela(Tabela tab,String variavel, String tipo) {
		 Simbolo simbolo = new Simbolo();
		 
		 if(tab.verificaSimbolo(variavel) == false) { 
		  	  simbolo.setTipo(tipo);
		  	  simbolo.setNome(variavel);
		  	  simbolo.setReferencia(tab.getMarcador());
		  	  tab.incrementaMarcador(tipo);
		  	  tab.insereSimbolo(simbolo);
	  	  }else {
	  		throw new ErroSemantico("Variavel "+ variavel + " Duplicada");
	  	  }
	 }

}
