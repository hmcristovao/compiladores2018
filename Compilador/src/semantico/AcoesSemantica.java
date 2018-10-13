package semantico;

import parser.Token;

public class AcoesSemantica {
	
	public static void variavelNaoDeclarada(Token t, Tabela tabela) {
		//System.out.println("Entrou na verificao");
		if(!tabela.verificaExistenciaSimbolo(t.image)) { 
			System.out.println("Erro semântico \n A variável "+t+ " não foi inicializada");
			System.exit(1);
		}
	}
	public static void trataDeclaracao(Tabela tabela, Token t, TipoDado tipo) {
		if(tabela.verificaExistenciaSimbolo(t.image)){
			System.out.println("A variavel "+t.image+" ja foi declarada." );
			System.exit(1);
		}
		else{
			Simbolo simbolo = null;
			if(tipo == TipoDado.NUMERO) {
				 simbolo = new Simbolo(t, TipoDado.NUMERO, tabela.getProximaReferencia());	
				 tabela.incluiSimbolo(simbolo);
				 tabela.setProximaReferencia(tabela.getProximaReferencia() + 2); 
			}	
			else {
				simbolo = new Simbolo(t, TipoDado.PALAVRA, tabela.getProximaReferencia());
				tabela.incluiSimbolo(simbolo);
				tabela.setProximaReferencia(tabela.getProximaReferencia() + 1);
			}
		}
	} 
}
