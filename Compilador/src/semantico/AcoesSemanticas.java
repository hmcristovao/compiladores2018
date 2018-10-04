package semantico;

import tratamentoErro.ErroSemantico;

public class AcoesSemanticas {
		 
	 
	 public static void verificaVariavelDeclarada(Tabela tab, String variavel) {
		 if(tab.verificaSimbolo(variavel) == false) {
		  	  	throw new ErroSemantico ("Variavel "+ variavel + " nao declarada");
		 }
		 
	 }
	 
}
