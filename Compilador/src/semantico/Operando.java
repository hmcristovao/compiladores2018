package semantico;
import parser.*;

public class Operando extends Item
{
	private TipoDado tipoDado;
	private TipoElemento tipoElemento;

//	public Operando(Token _token, TipoElemento elemento)
//	{
//		super(_token);
//		this.tipoElemento = elemento;
//	}
	
	public Operando(Token _token, TipoDado _dado, TipoElemento _tpElemento )
	{
		super(_token);
		this.tipoDado = _dado;
		this.tipoElemento = _tpElemento;
	}
	
	public TipoDado getTipoDado()
	{
		return this.tipoDado;

	}

	public TipoElemento getTipoElemento()
	{
		return this.tipoElemento;
	}

	@Override
	public String toString()
	{
		return "(" + this.getLexema() + ";" +  this.getTipoDado() + ";" +  this.getTipoElemento() + ")";
	}
}
