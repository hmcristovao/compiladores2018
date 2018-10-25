package comandos;
import java.util.Iterator;
import java.util.LinkedList;

import primitivo.ComandoPrimitivo;
import primitivo.ListaComandosPrimitivos;
import primitivo.PrimitivoAtribuicao;
import primitivo.PrimitivoEntrada;
import primitivo.PrimitivoSaida;
import parser.*;

public class ListaComandosAltoNivel {
	
	public LinkedList<ComandoAltoNivel> listaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	
	public ListaComandosAltoNivel() {
		
	}
	
	 public ListaComandosPrimitivos geraListaComandosPrimitivosTotal() {
		 ListaComandosPrimitivos lcmp = new ListaComandosPrimitivos();
		 
		 for(int i=0; i<listaComandosAltoNivel.size(); i++) {
			 
			 ComandoAltoNivel comando = listaComandosAltoNivel.get(i);
			 
			 if(comando != null)
				 lcmp.listaComandosPrimitivos.addAll(comando.geraListaComandosPrimitivos().getListaComandosPrimitivos());
			 			 		
		 }	 

		 return lcmp;
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
