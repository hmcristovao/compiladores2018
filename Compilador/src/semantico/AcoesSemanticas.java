package semantico;
import apoio.*;

public class AcoesSemanticas {

	public static void inicializacao(Tabela tab, String var) {
		
		if(!tab.isExiste(var))
			throw new ErroSemantico("Erro sem�ntico \n A vari�vel " + var + " n�o foi inicializada");
	}
	
	public static void declaracao(Tabela tabela, String var, Simbolo simb, TipoDado tipo) {
		
		if(tabela.isExiste(var))
			throw new ErroSemantico("Erro sem�ntico \n A vari�vel " + var + " j� foi declarada");
		else {
	  		simb = new Simbolo(var, tipo,tabela.marcador);
	  		
	  		simb.setReferencia(tabela, tipo);
	  		tabela.inclui(simb);
		}
	}
}
