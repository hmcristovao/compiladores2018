package comandoPrimitivo;

import java.util.LinkedList;

public class ListaComandosPrimitivos {
	
	private LinkedList<ComandoPrimitivo> listaComandosPrimitivos;
	
	public ListaComandosPrimitivos() {
		this.listaComandosPrimitivos = new LinkedList<ComandoPrimitivo>(); 
	}

	public void addComando(ComandoPrimitivo comando) {
		this.listaComandosPrimitivos.add(comando);
	}
	
	public LinkedList<ComandoPrimitivo> getListaComandosPrimitivos(){
		return this.listaComandosPrimitivos;
	}
	
	public String geraCodigoDestinoTotal() {
		
		StringBuilder codigo = new StringBuilder();
	
		for(ComandoPrimitivo comandoPrimitivo : this.listaComandosPrimitivos) {
			codigo.append(comandoPrimitivo.geraCodigoDestino());
		}
		return codigo.toString();
	}
	
	@Override
	public String toString() {
		return  this.listaComandosPrimitivos.toString();
	}
	
}
