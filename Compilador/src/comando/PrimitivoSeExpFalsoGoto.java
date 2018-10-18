package comando;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo
{

	private PrimitivoLabel labelFalse;
	private String expDestinoAssembler;
	private ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(PrimitivoLabel _labelfalse,
			String _expDestAssemb, ListaComandosPrimitivos _listComPriTrue)
	{
		this.labelFalse = _labelfalse;
		this.expDestinoAssembler = _expDestAssemb;
		this.listaComandosPrimitivosTrue = _listComPriTrue;
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
		return "SeExpFalsoGoto(" + this.expDestinoAssembler + ", " + this.getLabel() + "," +
				this.getListaComandosPrimitivosTrue()+")";
	}
	
	public PrimitivoLabel getLabel()
	{
		return this.labelFalse;
	}
	
	public String getExpDestinoAssembler()
	{
		return this.expDestinoAssembler;
	}
	
	public ListaComandosPrimitivos getListaComandosPrimitivosTrue()
	{
		return this.listaComandosPrimitivosTrue;
	}
	
}
