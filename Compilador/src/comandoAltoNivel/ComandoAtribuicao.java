package comandoAltoNivel;

import comandoPrimitivo.*;
import parser.Token;
import semantico.*;
import codigoDestino.CodigoDestino;

public class ComandoAtribuicao extends ComandoAltoNivel {
	
	private Simbolo simbolo;
	public Expressao expressao;
	
	public ComandoAtribuicao (Simbolo simbolo, Expressao expressao, Token token) {
		this.simbolo = simbolo;
		this.expressao = expressao;
		this.token = token;
	}
	
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos lista = new ListaComandosPrimitivos();
		PrimitivoAtribuicao comando = new PrimitivoAtribuicao(this.simbolo.getReferencia(), this.simbolo.getTipo(), this.expressao.geraCodigoDestino());
		
		//calculo da stack
		if(this.simbolo.getTipo() == TipoDado.NUMERO)
			CodigoDestino.aux -=2;
		else if(this.simbolo.getTipo() == TipoDado.PALAVRA)
			CodigoDestino.aux -=1;
		
		lista.addComando(comando);
		return lista;
	}
	
	
	
	@Override
	public String toString() {
		return "\nComando Atribuicao - lexema: \""+this.getLexema() 
		     + "\" - simbolo: " + this.simbolo.getNome() 
		     + " - expressao: " + this.expressao;
	}

}
