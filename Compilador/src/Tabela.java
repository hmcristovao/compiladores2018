import java.util.*;

public class Tabela {
	static Simbolo simb;
	public static void addVar(HashMap<String, Simbolo> tab, Token t, Token v) {
		if(tab.containsKey(v.image) == false) { //caso nao contenha a chave
  	  		simb = new Simbolo();
	  		simb.setNome(v.image); //salva o nome 
	  		simb.setReferencia(simb.incMarcador(t.image)); //calcula a referencia do próximo e seta a minha referencia
			if(t.image.equals(Tipo.NUMERO.getNome())) { simb.setTipo(Tipo.NUMERO); /*salva o tipo da variavel*/ }
			if(t.image.equals(Tipo.PALAVRA.getNome())) { simb.setTipo(Tipo.PALAVRA); /*salva o tipo da variavel*/ }
	  		tab.put(v.image, simb); //salva o simbolo na tabela hashing  
  	  	}else { //erro, chave ja adicionada
			System.out.println("Erro: variável "+v.image+" declarada novamente na linha "+v.endLine );
  	  	}
	}
	
	public static void verificaDeclarada(HashMap<String, Simbolo> tab, Token v) {
		if(tab.containsKey(v.image) == false) { //caso nao contenha a chave
			System.out.println("Erro: variável "+v.image+" não declarada na linha "+v.endLine );
  	  	}
	}
}
