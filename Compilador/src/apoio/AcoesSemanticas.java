package apoio;

import comando.ComandoAtribuicao;
import comando.ListaComandosAltoNivel;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Tabela;
import semantico.TipoDado;

public class AcoesSemanticas {
	
	public static void addAtribuicaoVariavel(ListaComandosAltoNivel comandos, Token t, Token v, Tabela tab, Expressao exp) {
		
		
		ComandoAtribuicao comandoAtribuicao;
		
		
		if (t.image.equals("numero")) { 
			tab.incluiSimbolo(v, TipoDado.NUM); 
			}
		else { 
			tab.incluiSimbolo(v, TipoDado.STR); 
			}
		if(exp != null) {
			comandoAtribuicao = new ComandoAtribuicao(v, tab.consultaSimbolo(v.image), exp);
		}
		else {
			comandoAtribuicao = new ComandoAtribuicao(v, tab.consultaSimbolo(v.image), null);
		}
		comandos.addComando(comandoAtribuicao);
	}
}
