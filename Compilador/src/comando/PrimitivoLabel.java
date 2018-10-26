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
	public StringBuilder geraCodigoDestino() 
	{
		StringBuilder codigoDestino = new StringBuilder();
		codigoDestino.append( this.getLabel() + ":\n" );
		return codigoDestino;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return this.getLabel() + "\n";
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
