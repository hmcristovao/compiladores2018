package comando;

import geradorCodigo.Expressao;
import parser.Token;
import semantico.Simbolo;
import semantico.TipoDado;

public class ComandoAtribuicao extends ComandoAltoNivel {

	Simbolo variavel;
	Expressao expressao;
	
	public ComandoAtribuicao(Token _token, Simbolo _simbolo, Expressao _expressao) {
		super(_token);
		this.variavel = _simbolo;
		this.expressao = _expressao;
		// TODO Auto-generated constructor stub
	}
	
	public void adicionaComando(Token _token, Expressao _expressao) {
		Simbolo simbolo = new Simbolo(_token,TipoDado.STR);
		
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Comando atribui��o\n" +"Variavel " + this.variavel.getLexema() + " recebe " + this.expressao.getListaExpPosfixa();
	}

	//public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();
}