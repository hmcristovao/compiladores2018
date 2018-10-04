package semantico;

public class AcoesSemanticas {
	
	public static void declaraVariavel(String nome, int linha, int ref, Tabela tabela) {
		
		boolean ver=tabela.push(nome,ref);
		if(ver==false) System.out.println("Erro semântico: declaração da variável "+nome+" repetida na linha "+linha+"\n");

	}
	
	public static void verificaDeclaracao(String nome, int linha, Tabela tabela) {
		if(!tabela.existe(nome)) System.out.println("Erro semântico: variável "+nome+" não declarada na linha "+linha+"\n");
	}
	
}
