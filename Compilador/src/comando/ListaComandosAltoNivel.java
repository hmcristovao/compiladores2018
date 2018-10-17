package comando;


import java.util.LinkedList;

public class ListaComandosAltoNivel
{

	private LinkedList<ComandoAltoNivel> ListaComandosAltoNivel;

	public ListaComandosAltoNivel()
	{
		this.ListaComandosAltoNivel = new LinkedList<ComandoAltoNivel>();
	}

	public void addComando(ComandoAltoNivel _comand)
	{
		this.ListaComandosAltoNivel.add(_comand);
	}

	public ListaComandosPrimitivos geraListaComandoPrimitivosTotal()
	{
		ListaComandosPrimitivos listaComandosPrimitivosTotal = new ListaComandosPrimitivos();
		ListaComandosPrimitivos elementoLista;
		
		for(ComandoAltoNivel comando : ListaComandosAltoNivel )
		{
			elementoLista = comando.geraListaComandosPrimitivos();
			LinkedList<ComandoPrimitivo> cadeiaComandos = elementoLista.getListaComandosPrimitivos();
			for( ComandoPrimitivo _cmdp : cadeiaComandos )
			{
				listaComandosPrimitivosTotal.addComando(_cmdp);
			}
		}
		
		return listaComandosPrimitivosTotal;
	}
	
	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel()
	{
		return this.ListaComandosAltoNivel;
	}

	@Override
	public String toString()
	{
		for(ComandoAltoNivel comando :this.ListaComandosAltoNivel)
		{
			System.out.println(comando);
		}
		return "";
	}	

}