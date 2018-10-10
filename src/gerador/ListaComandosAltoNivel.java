package gerador;

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
}
