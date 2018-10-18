package comando;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo
{

	private int referencia;

	private TipoDado tipo;
	
	public PrimitivoEntrada(int _referencia, TipoDado _tipo)
	{
		this.referencia = _referencia;
		this.tipo = _tipo;
	}
	
	@Override
	public String geraCodigoDestino() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "entrada("+this.getTipo()+";"+this.getReferencia()+")";
	}
	
	public TipoDado getTipo()
	{
		return this.tipo;
	}
	
	public int getReferencia()
	{
		return this.referencia;
	}
	
}
