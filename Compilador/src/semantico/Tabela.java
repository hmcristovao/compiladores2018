package semantico;

import java.util.HashMap;

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
	
	public void imprimeTabela(){
		System.out.println(tab);
	}
	
	public static void incrementaMarcador(String tipo) {
		
		if(tipo.equals("numero")) {
			
			marcador+=2;
		}
		if(tipo.equals("palavra")) {
			marcador+=1;
		}
	}

}
