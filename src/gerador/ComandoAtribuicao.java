package gerador;

import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoAtribuicao;
import semantico.Simbolo;
import semantico.TipoDado;

public class ComandoAtribuicao extends ComandoAltoNivel {
    
	private Simbolo variavel;
    private Expressao expressao;
    
    public ComandoAtribuicao(Simbolo _simb, Expressao _exp) {
    	this.variavel = _simb;
    	this.expressao = _exp;
    }
    
    @Override
    public String toString() {
    	return "\n\nComando Atribuicao de simbolo:" + this.variavel.toString() 
    		  + this.expressao.toString();
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
    	
		ListaComandosPrimitivos atribuicao = new ListaComandosPrimitivos();
		int referencia = variavel.getReferencia();
		TipoDado tipo = variavel.getTipo();
		
		PrimitivoAtribuicao primitivoAtribuicao = new PrimitivoAtribuicao(referencia,tipo,expressao.toString());
		atribuicao.addComando(primitivoAtribuicao);
		return atribuicao;
    	
    }

    public Simbolo getVariavel() {
        return variavel;
    }

    public Expressao getExpressao() {
        return expressao;
    }
    
}
