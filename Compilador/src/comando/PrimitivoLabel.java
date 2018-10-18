package comando;


public class PrimitivoLabel extends ComandoPrimitivo
{

	private static int contador=1;
	
	private String label;
	
	public PrimitivoLabel(String _label)
	{
		this.label = _label+"_"+PrimitivoLabel.contador;
		PrimitivoLabel.contador++;
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
		return this.getLabel();
	}
		
	public String getLabel()
	{
		return this.label;
	}
	
	public int getContador()
	{
		return this.contador;
	}
	
}
