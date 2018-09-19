package files;

import java.util.*;

public class Tabela {
	
	static HashMap<String, Simbolo> tab = new HashMap<String, Simbolo>();
	
	
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
	
	
}
