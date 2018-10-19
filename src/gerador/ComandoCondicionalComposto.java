package gerador;

import primitivo.ListaComandosPrimitivos;

public class ComandoCondicionalComposto extends ComandoCondicional {
	
    private ListaComandosAltoNivel listaComandosAltoNivelFalse;
    
    public ComandoCondicionalComposto(Expressao _exp, ListaComandosAltoNivel _lista, ListaComandosAltoNivel _lista2) {
    	super(_exp, _lista);
    	this.listaComandosAltoNivelFalse = _lista2;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		ListaComandosPrimitivos condicionalComposto = new ListaComandosPrimitivos();
		return condicionalComposto;
    }

    public ListaComandosAltoNivel getListaComandosAltoNivelFalse() {
        return listaComandosAltoNivelFalse;
    }

}
