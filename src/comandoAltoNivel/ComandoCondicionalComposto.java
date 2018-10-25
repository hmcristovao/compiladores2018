package comandoAltoNivel;
import comandoPrimitivo.*;
import gerador.Expressao;
import parser.Token;

public class ComandoCondicionalComposto extends ComandoCondicional {
	
    private ListaComandosAltoNivel listaComandosAltoNivelFalse;
    
    public ComandoCondicionalComposto(Token token,Expressao _exp, ListaComandosAltoNivel listaComandosAltoNivelTrue, ListaComandosAltoNivel listaComandosAltoNivelFalse) {
    	super(token,_exp, listaComandosAltoNivelTrue);
    	this.listaComandosAltoNivelFalse = listaComandosAltoNivelFalse;
    }


    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
    	return null;
    }

    public String toString() {
        return null;
    }

}