package semantico;
import apoio.*;

public class AcoesSemanticas {

	public static void inicializacao(Tabela tab, String var) {
		
		if(!tab.isExiste(var))
			throw new ErroSemantico("Erro semântico \n A variável " + var + " não foi inicializada");
	}
	
	public static void declaracao(Tabela tab, String var) {
		
		if(tab.isExiste(var))
			throw new ErroSemantico("Erro semântico \n A variável " + var + " já foi declarada");
		
	}
}
