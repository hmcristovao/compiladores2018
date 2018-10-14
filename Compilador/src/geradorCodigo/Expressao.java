package geradorCodigo;

import java.util.LinkedList;
import semantico.*;

public class Expressao
{
	private LinkedList<Item> expressaoInfixa;
	private LinkedList<Item> expressaoPosfixa;

	public Expressao()
	{
		this.expressaoPosfixa = new LinkedList<Item>();
		this.expressaoInfixa = new LinkedList<Item>();
	}

	public LinkedList<Item> getExpressaoInfixa()
	{
		return this.expressaoInfixa;
	}

	public LinkedList<Item> getExpressaoPosfixa()
	{
		return this.expressaoPosfixa;
	}

	public void addItemInfixo(Item _item)
	{
		this.getExpressaoInfixa().add(_item);
	}

	public void addItemPosfixo(Item _item)
	{
		this.getExpressaoPosfixa().add(_item);
	}

/*	public Tipo getTipo()
	{
		return null;
	}*/

	public String geraCodigoDestino()
	{
		return null;
	}

	@Override
	public String toString()
	{
		return ""+this.expressaoPosfixa;
	}
}