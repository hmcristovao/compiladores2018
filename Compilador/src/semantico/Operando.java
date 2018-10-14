package semantico;
import parser.*;

public class Operando extends Item
{
	private TipoDado tipoDado = null;
	private TipoElemento tipoElemento = null;

	public Operando(Token _token, TipoElemento elemento)
	{
		super(_token);
		this.tipoElemento = elemento;
	}
	
	public Operando(Token _token, TipoDado dado)
	{
		super(_token);
		this.tipoDado = dado;
	}
	public TipoDado getTipoDado()
	{
		return tipoDado;

	}

	public TipoElemento getTipoElemento()
	{
		return tipoElemento;

	}

	@Override
	public String toString()
	{
		if(tipoElemento==null)
			return "(" + this.getLexema() + ";" +  this.getTipoDado() + ")";	
		return "(" + this.getLexema() + ";" +  this.getTipoElemento() + ")";
	}
}
