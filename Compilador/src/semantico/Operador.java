package semantico;

import parser.*;

public class Operador extends Item
{
	private TipoOperador tipoOperador;

	public Operador(Token _token, TipoOperador operador)
	{
		super(_token);
		this.tipoOperador = operador;
	}
	
	public TipoOperador getTipoOperador()
	{
		return tipoOperador;

	}

	@Override
	public String toString()
	{
		return "(" + this.getLexema() + ";" +  this.getTipoOperador() + ")";	
	}
}