package gerador;
import primitivo.ComandoPrimitivo;
import primitivo.ListaComandosPrimitivos;

import java.util.LinkedList;


public class ListaComandosAltoNivel {

    LinkedList<ComandoAltoNivel> listaComandosAltoNivel;

    public ListaComandosAltoNivel() {
        this.listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
    }

    public void addComando(ComandoAltoNivel _cmd) {
    	this.listaComandosAltoNivel.add(_cmd);
    }

    public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel() {
        return this.listaComandosAltoNivel;
    }

    public String toString() {
        return "Lista de Comandos:\n"+ this.listaComandosAltoNivel.toString();
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
