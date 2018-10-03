package semantico;

public class AcoesSemanticas {

	public static void inicializacao(Tabela tab, String var) {
		
		if(!tab.isExiste(var))
			System.out.println("Erro semântico A variável "+ var + " não foi inicializada");
		
	}
	
	public static void declaracao(Tabela tab, String var) {
		
		if(tab.isExiste(var))
			System.out.println("Erro semântico \n A variável " + var + " já foi declarada");
		
	}
}
