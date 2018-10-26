package comando;


public class PrimitivoGoto extends ComandoPrimitivo
{

	private PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel _label)
	{
		this.label = _label;
	}
	
	@Override
	public StringBuilder geraCodigoDestino()
	{
		StringBuilder codigoDestino = new StringBuilder();
		codigoDestino.append("goto " + this.getLabel() + "\n");
		
		return codigoDestino;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "goto("+this.getLabel()+")\n";
	}
	
	public PrimitivoLabel getLabel()
	{
		return this.label;
	}
	
}
