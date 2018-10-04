package semantico;
import apoio.*;

public class AcoesSemanticas {

	public static void inicializacao(Tabela tab, String var) {
		
		if(!tab.isExiste(var))
			throw new ErroSemantico("Erro semântico \n A variável " + var + " não foi inicializada");
	}
	
	public static void declaracao(Tabela tabela, String var, Simbolo simb, String tipo) {
		
		if(tabela.isExiste(var))
			throw new ErroSemantico("Erro semântico \n A variável " + var + " já foi declarada");
		else {
	  		simb = new Simbolo(var, tipo);
	  		simb.setReferencia(tabela, tipo);
	  		tabela.inclui(simb);
		}
	}
}
