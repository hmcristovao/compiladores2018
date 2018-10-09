package comandos;
import java.util.LinkedList;

public class ListaComandosAltoNivel {
	public LinkedList<ComandoAltoNivel> listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	
	public ListaComandosAltoNivel() {
		
	}
	
	public void addComando(ComandoAltoNivel comando) {		
		this.listaComandosAltoNivel.add(comando);

		System.out.println(listaComandosAltoNivel);
	}
	
}
