package comandoAltoNivel;

import java.util.LinkedList;

import comandoPrimitivo.ComandoPrimitivo;
import comandoPrimitivo.ListaComandosPrimitivos;

public class ListaComandosAltoNivel {
	

	LinkedList<ComandoAltoNivel> listaComandosAltoNivel;
	
	public ListaComandosAltoNivel() {
		listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();   
	}
	
	public void addComando(ComandoAltoNivel comando) {
		listaComandosAltoNivel.add(comando);
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel(){
		return listaComandosAltoNivel;
	}
	
	public ListaComandosPrimitivos geraListaComandoPrimitivosCompleta() {
		
		ListaComandosPrimitivos listaComandosPrimitivosCompleta = new ListaComandosPrimitivos();
		
		for(ComandoAltoNivel comando : listaComandosAltoNivel ){
			
			ListaComandosPrimitivos listaComandosPrimitivos = comando.geraListaComandosPrimitivos();
			
			for(ComandoPrimitivo comandoPrimitivo : listaComandosPrimitivos.getListaComandosPrimitivos()){
				listaComandosPrimitivosCompleta.addComando(comandoPrimitivo);
			}
			
		}
		
		return listaComandosPrimitivosCompleta;
		
		
	}
	
	
	
	@Override
	public String toString()
	{
		return  this.getListaComandosAltoNivel().toString();
	}
	


}
