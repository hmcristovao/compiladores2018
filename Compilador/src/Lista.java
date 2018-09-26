import java.util.LinkedList;

public class Lista 
{
	private LinkedList<Item> lista;
	
	public Lista()
	{
		this.lista = new LinkedList<Item>();
	}
	
	public void add( Item _item )
	{
		this.lista.add(_item);
	}

	@Override
	public String toString() 
	{
		return this.lista.toString();
	}
	
	
}
