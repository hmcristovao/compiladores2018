package comandos;
import java.util.LinkedList;

public class ListaComandosAltoNivel {
	
	public LinkedList<ComandoAltoNivel> listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	public ListaComandosAltoNivel() {
		
	}
	
	public void addComando(ComandoAltoNivel comando) {		
		
		if(comando!=null)this.listaComandosAltoNivel.add(comando);

	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel()
	{
		return this.listaComandosAltoNivel;
	}

	@Override
	public String toString()
	{
		return "" + this.getListaComandosAltoNivel();
	}
	
}
