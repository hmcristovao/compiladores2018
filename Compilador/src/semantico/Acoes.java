package semantico;

public class Acoes {
	
	public void verifica_semantico(String t, Tabela tabela) {
		if(!tabela.isExiste(t)) { 
			System.out.println("Erro semântico \n A variável "+t+ " não foi inicializada");
			System.exit(1);
		}
	}

//	public void addSimbolo(String t) {
//		 if(!isExiste(t)) { 
//				Simbolo simb = new Simbolo(t);
//		 		inclui(simb);
//		}
//	}
}
