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
		if ( _comand != null )
			this.ListaComandosAltoNivel.add(_comand);
	}

	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel()
	{
		return this.ListaComandosAltoNivel;
	}

	@Override
	public String toString()
	{
		return "BLOCO " + this.getListaComandosAltoNivel();
	}	

}