package comandoPrimitivo;

import java.util.LinkedList;

public class ListaComandosPrimitivos {

    LinkedList<ComandoPrimitivo> listaComandosPrimitivos;

    public ListaComandosPrimitivos() {
    	listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();
    }

    public void addComando(ComandoPrimitivo _cmd) {
    	this.listaComandosPrimitivos.add(_cmd);
    }

    public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos() {
        return this.listaComandosPrimitivos;
    }
    
    public String geraCodigoDestinoTotal() {
    	String codigoDestinoTotal = "";
    	
    	for (ComandoPrimitivo comandoPrimitivo : this.listaComandosPrimitivos) {
    		String codigoDestino = comandoPrimitivo.geraCodigoDestino();
    		codigoDestinoTotal += codigoDestino + "\r\n";
    	}
    	
    	return codigoDestinoTotal;
    }
    
    public String toString(){
    	return "\n\nLista de Comandos Primitivos:\n"+ this.listaComandosPrimitivos.toString();
    }
}