package gerador;

import primitivo.ListaComandosPrimitivos;
import semantico.Simbolo;

public class ComandoSaida extends ComandoAltoNivel {

    private Expressao expressao;

    public ComandoSaida(Expressao expressao) {
		this.expressao = expressao;
	}

	@Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
    	return "\n\nComando Exibe:" + this.expressao.toString();
    }

    public Expressao getExpressao() {
        return expressao;
    }

}
