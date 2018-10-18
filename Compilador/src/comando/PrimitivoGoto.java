package comando;


public class PrimitivoGoto extends ComandoPrimitivo
{

	private PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel _label)
	{
		this.label = _label;
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
		return "goto("+this.getLabel()+")";
	}
	
	public PrimitivoLabel getLabel()
	{
		return this.label;
	}
	
}
