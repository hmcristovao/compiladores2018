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

	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel()
	{
		return this.ListaComandosAltoNivel;
	}

	@Override
	public String toString()
	{
		LinkedList<ComandoAltoNivel> lista = this.ListaComandosAltoNivel;
		for(ComandoAltoNivel comando : lista)
		{
			System.out.println(comando.toString());
		}
		return "";
	}	

}