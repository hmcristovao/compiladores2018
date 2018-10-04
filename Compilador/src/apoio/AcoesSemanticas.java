package apoio;

import semantico.Tabela;
import semantico.Tipo;
import semantico.Simbolo;

public class AcoesSemanticas {

	public static void verificarInicialização(Tabela tabela, String t, int l) {
	     if(!(tabela.isExiste(t))) {
	    	 throw new ErroSemantico("Erro semântico variável "+t+ " não foi declarada na linha "+l);
	      }
	}
	
	public static void adicionarTabela (Tabela tabela, String t, String tipo, int l) {
		if((tabela.isExiste(t))) {
			throw new ErroSemantico("Erro: variável "+t+" duplicada na linha "+l);
		}
		else {
			if(tipo.equals("NUMERO")) {
				Simbolo simb = new Simbolo(t,Tipo.NUMERO);
				tabela.inclui(simb);
				
			}
			else {
				Simbolo simb = new Simbolo(t,Tipo.PALAVRA);
				tabela.inclui(simb);
			
			}
		}
	}
}
