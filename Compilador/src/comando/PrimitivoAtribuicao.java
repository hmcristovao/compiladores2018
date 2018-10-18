package comando;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo
{
	private int referencia;

	private TipoDado tipo;

	private String expDestinoAssembler;
	
	public PrimitivoAtribuicao(int _referencia, TipoDado _tipo, String _expDestAssemb)
	{
		this.referencia = _referencia;
		this.tipo = _tipo;
		this.expDestinoAssembler = _expDestAssemb;
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
		return "atrib("+this.getTipo()+";"+this.getReferencia()+")";
	}

	public TipoDado getTipo()
	{
		return this.tipo;
	}
	
	public int getReferencia()
	{	
		return this.referencia;
	}
	
	public String getExpDestinoAssembler()
	{
		return this.expDestinoAssembler;
	}
	
}
