package semantico;


import parser.Compilador;
import parser.Token;
import tratamentoErro.ErroSemantico;

public class AcoesSemanticas {
	
	public static int qtdWarnings = 0;
	
	public static void incompatibilidadeTipoExpressao (Item item, Expressao expressao, Token token) {
		Operando operando = (Operando) item;
															//Tratamento de incompatibilidade de tipos entre expressoes.
															//Percorre a lista a listaExpInfixa.
		for(Item itemAux : expressao.getListaExpInfixa()) { 
															//Verifica somente os itens que sao operando.
			if(itemAux instanceof Operando) {
				Operando operandoAux = (Operando)itemAux;
															// Verfica se o tipo de dados do item passado eh diferente do
															// tipo de dados dos itens da lista.
				if(!(operando.getTipoDado()==operandoAux.getTipoDado())) {
															// Erro de incompatibilidade de tipos entre expressoes.
					throw new ErroSemantico("Incompatibilidade de tipos entre expressoes na linha: " + token.beginLine); 
				}
			}
		}
	} 
	
	public static void incompatibilidadeTipoAtribuicao (Simbolo simbolo, Expressao expressao, Token token) {
															// Tratamento de incompatibilidade de tipos no comando de atribuicao, 
															// isto e, entre variavel que recebe a expressao e a expressao.
															// Percorre a lista a listaExpInfixa.
		for(Item itemAux : expressao.getListaExpInfixa()) {
															//Verifica somente os itens que sao operando.
			if(itemAux instanceof Operando) {
				Operando operandoAux = (Operando)itemAux;
															//Verifica se o tipo de dado dos itens da 
															//expressao eh diferente do tipo de dado do simbolo.
				if(!(simbolo.getTipo()==operandoAux.getTipoDado())) {
															// Erro de incompatibilidade entre o tipo de dado da variavel e o tipo 
															// de dados dos itens da expressao.
					throw new ErroSemantico("Incompatibilidade de tipos no comando de atribuicao entre variavel e a expressao na linha : " + token.beginLine);
				}
			}
		}
	}
	
	public static void faltaInicializacaoVariavel (Expressao expressao, Token token) {
															//Tratamento, falta de inicializacao de uma variavel
															//Percorre a lista a listaExpInfixa.
		for(Item itemAux : expressao.getListaExpInfixa()) {
															//Verifica somente os itens que sao operando.
			if(itemAux instanceof Operando) {
				Operando operandoAux = (Operando)itemAux;
															//Verifica somente os itens que sao operando do tipo elemento VAR.
				if(operandoAux.getTipoElemento() == TipoElemento.VAR){
															//Consulta o simbolo, retornando seu status (True ou False).
					if(!(Compilador.tabela.pesquisaTabela(operandoAux.getLexema()).getIsInicializada())) { 
															//Erro, falta inicializacao de uma variavel se for False.
						throw new ErroSemantico("Falta de inicializacao de uma variavel na linha : " + token.beginLine);
					}
				}
			}
		}
	}
	
	public static void warnings() {
		//percorrer tabela de simbolos
		Compilador.tabela.tab.forEach((key, value) -> {
			//verificar se isInicializada == false, a variavel não foi inicializada
			if(value.getIsInicializada() == false) {
				System.out.println("Warning: Variável declarada "+value.getNome()+" declarada, mas não inicializada.");
				qtdWarnings++;
			}
			
			//verificar se isInicializada == true isUtilizada == false, variavel foi inicializada porém não foi utilizada
			if(value.getIsInicializada() == true && value.getIsUtilizada() == false) {
				System.out.println("Warning: Variável "+value.getNome()+" declarada, inicializada, mas não utilizada.");
				qtdWarnings++;
			}
		});
			
	}
}
