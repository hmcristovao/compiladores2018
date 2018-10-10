package gerador;

import primitivo.ListaComandosPrimitivos;
import semantico.Simbolo;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Simbolo getVariavel() {
        return variavel;
    }

    public Expressao getExpressao() {
        return expressao;
    }
    
}
