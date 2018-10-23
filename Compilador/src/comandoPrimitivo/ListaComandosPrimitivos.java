package comandoPrimitivo;

import java.util.LinkedList;

public class ListaComandosPrimitivos {
	
	LinkedList<ComandoPrimitivo> listaComandosPrimitivos;
	
	public ListaComandosPrimitivos() {
		this.listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>(); 
	}

	public void addComando(ComandoPrimitivo comando) {
		this.listaComandosPrimitivos.add(comando);
	}
	
	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos(){
		return this.listaComandosPrimitivos;
	}
	
	@Override
	public String toString()
	{
		return  this.getListaComandosPrimitivos().toString();
	}
	
}
