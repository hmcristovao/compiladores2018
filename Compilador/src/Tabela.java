import java.util.*;

public class Tabela {
	static Simbolo simb;
	private int marcador = 1; // armazena a última referência
	
	public HashMap<String, Simbolo> tab;
	
	Tabela(){
		tab = new HashMap<String, Simbolo>();
	}
	
	   // incluída na tabela
	public void addVar(Token t, Token v) {
		if(tab.containsKey(v.image) == false) { //caso nao contenha a chave
  	  		simb = new Simbolo();
	  		simb.setNome(v.image); //salva o nome 
	  		simb.setReferencia(incMarcador(t.image)); //calcula a referencia do próximo e seta a minha referencia
			if(t.image.equals(Tipo.NUMERO.getNome())) { simb.setTipo(Tipo.NUMERO); /*salva o tipo da variavel*/ }
			if(t.image.equals(Tipo.PALAVRA.getNome())) { simb.setTipo(Tipo.PALAVRA); /*salva o tipo da variavel*/ }
	  		tab.put(v.image, simb); //salva o simbolo na tabela hashing  
  	  	}else { //erro, chave ja adicionada
			System.out.println("Erro: variável "+v.image+" declarada novamente na linha "+v.endLine );
  	  	}
	}
	
	boolean verificaDeclarada(Token v) {
		if(tab.containsKey(v.image) == false) { //caso nao contenha a chave
			System.out.println("Erro: variável "+v.image+" não declarada na linha "+v.endLine );
			return false;
  	  	}
		return true;
	}
	
	public int incMarcador(String tipo) {
	   if(tipo.equals(Tipo.PALAVRA.getNome())) {
		   marcador = marcador+1;
		   return marcador-1;
	   }else if(tipo.equals(Tipo.NUMERO.getNome())) {
		   marcador = marcador+2;
		   return marcador-2;
	   }else {
		   return 0; //necessario? 
	   }
   }
	
	public int getMarcador() {
		return marcador;
	}
	
	public void setMarcador(int marcador) {
		marcador = marcador;
	}
}
