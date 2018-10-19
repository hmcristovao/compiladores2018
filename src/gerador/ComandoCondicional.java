package gerador;

import primitivo.ListaComandosPrimitivos;

public abstract class ComandoCondicional extends ComandoAltoNivel {
	Expressao expressao;
	ListaComandosAltoNivel lista;
	
    public ComandoCondicional(Expressao _exp, ListaComandosAltoNivel _lista) {
		this.expressao = _exp;
		this.lista = _lista;
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos condicional = new ListaComandosPrimitivos();
		return condicional;
    }

    @Override
    public String toString() {
        return "\n\nComando Condicional" + this.expressao.toString()
        	  + this.lista.toString();
    }

}
