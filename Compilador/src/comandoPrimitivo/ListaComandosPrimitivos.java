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
	
	public String geraCodigoDestinoCompleto() {
		
		String codigoDestinoCompleto = "";
	
		for(ComandoPrimitivo comamadoPrimitivo : this.listaComandosPrimitivos) {
			String codigoDestino = comamadoPrimitivo.geraCodigoDestino();
			
			if(!codigoDestino.isEmpty()) {
				codigoDestinoCompleto += codigoDestino + "\n";
			}
		}
		return codigoDestinoCompleto;
	}
	
	@Override
	public String toString()
	{
		return  this.getListaComandosPrimitivos().toString();
	}
	
}
