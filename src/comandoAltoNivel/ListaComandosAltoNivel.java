package comandoAltoNivel;
import comandoPrimitivo.*;

import java.util.LinkedList;

public class ListaComandosAltoNivel {

    LinkedList<ComandoAltoNivel> listaComandosAltoNivel;

    public ListaComandosAltoNivel() {
        this.listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
    }

    public void addComando(ComandoAltoNivel _cmd) {
    	if(_cmd != null) {
    		this.listaComandosAltoNivel.add(_cmd);
    	}
    }

    public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel() {
        return this.listaComandosAltoNivel;
    }

    public String toString() {
        return "\n\nLista de Comandos:\n"+ this.listaComandosAltoNivel.toString();
    }
    
    public ListaComandosPrimitivos geraListaComandosPrimitivosTotal() {
    	ListaComandosPrimitivos listaComandosPrimitivosTotal = new ListaComandosPrimitivos();
    	ListaComandosPrimitivos aux;
    	
    	for(ComandoAltoNivel comando : this.listaComandosAltoNivel) {
    		aux = comando.geraListaComandosPrimitivos();
    		for(ComandoPrimitivo primitivo : aux.getListaComandosPrimitivos()) {
    			listaComandosPrimitivosTotal.addComando(primitivo);
    		}
    	}
    	return listaComandosPrimitivosTotal;
    	
    }
}
