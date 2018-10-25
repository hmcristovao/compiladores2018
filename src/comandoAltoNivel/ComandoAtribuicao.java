package comandoAltoNivel;
import comandoPrimitivo.*;
import semantico.*;


import gerador.Expressao;
import parser.Token;
import semantico.Simbolo;

public class ComandoAtribuicao extends ComandoAltoNivel {
    
	private Simbolo variavel;
    private Expressao expressao;
    
    public ComandoAtribuicao(Token token, Simbolo _simb, Expressao _exp) {
    	super(token);
    	this.variavel = _simb;
    	this.expressao = _exp;
    }
    

    public String toString() {
    	return "\n\nComando Atribuicao:" + this.variavel.toString() + this.expressao.toString();
    }

   
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
    	
		ListaComandosPrimitivos listaPrimitivoAtribuicao = new ListaComandosPrimitivos();
		int referencia = variavel.getReferencia();
		TipoDado tipo = variavel.getTipo();
		PrimitivoAtribuicao primitivoAtribuicao = new PrimitivoAtribuicao(referencia,tipo,expressao.geraCodigoDestino());
		listaPrimitivoAtribuicao.addComando(primitivoAtribuicao);
		return listaPrimitivoAtribuicao;
    	
    }

    
}