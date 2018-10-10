package gerador;

import primitivo.ListaComandosPrimitivos;
import semantico.Simbolo;

public class ComandoEnquanto extends ComandoAltoNivel {

    private Expressao expressao;
    private ListaComandosAltoNivel listaComandosAltoNivelTrue;

    public ComandoEnquanto(Expressao expressao, ListaComandosAltoNivel listaComandosAltoNivelTrue) {
		this.expressao = expressao;
		this.listaComandosAltoNivelTrue = listaComandosAltoNivelTrue;
	}

	@Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
    	return "Comando Enquanto:" + this.expressao.toString() 
    		 + "\nLista de Comandos True:" + this.listaComandosAltoNivelTrue.toString();
    }

    public Expressao getExpressao() {
        return expressao;
    }

    public ListaComandosAltoNivel getListaComandosAltoNivelTrue() {
        return listaComandosAltoNivelTrue;
    }

}
