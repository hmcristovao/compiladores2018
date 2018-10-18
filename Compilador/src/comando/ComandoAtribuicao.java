package comando;

import comandoPrimitivo.ListaComandosPrimitivos;
import comandoPrimitivo.PrimitivoAtribuicao;
import geradorCodigo.Expressao;
import parser.Token;
import semantico.Simbolo;

public class ComandoAtribuicao extends ComandoAltoNivel{
	Simbolo variavel;
	Expressao expressao;
	public ComandoAtribuicao(Token token, Simbolo simbolo, Expressao expressao) {
		super(token);
		this.variavel = simbolo;
		this.expressao = expressao;
	}

	
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//implementar na segunda passagem
		ListaComandosPrimitivos listaAtribuicao = new ListaComandosPrimitivos();
		
		//cria o primitivo da atribuicao para a variável
		PrimitivoAtribuicao primitivo = new PrimitivoAtribuicao(this.variavel.getReferencia(), this.variavel.getTipo(), this.expressao.geraCodigoDestino());
		
		//adiciona a variável na lista de atribuicao
		listaAtribuicao.addComando(primitivo);
		
		return listaAtribuicao;
	}

	public String toString() {
		
		return null;
	}

}
