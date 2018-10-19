package primitivo;

import java.util.LinkedList;

public class ListaComandosPrimitivos {

    LinkedList<ComandoPrimitivo> listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>();

    public ListaComandosPrimitivos() {
        // TODO Auto-generated constructor stub
    }

    public void addComando(ComandoPrimitivo _cmd) {
    	this.listaComandosPrimitivos.add(_cmd);
    }

    public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos() {
        return this.listaComandosPrimitivos;
    }
    public String toString(){
    	return "Lista de Comandos Primitivos:\n"+ this.listaComandosPrimitivos.toString();
    }
}
