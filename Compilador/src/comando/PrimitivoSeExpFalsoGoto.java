package comando;

import java.util.LinkedList;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo
{

	private PrimitivoLabel labelFalse;
	private StringBuilder expDestinoAssembler;
	private ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(PrimitivoLabel _labelfalse, StringBuilder _expDestAssemb, ListaComandosPrimitivos _listComPriTrue)
	{
		this.labelFalse = _labelfalse;
		this.expDestinoAssembler = _expDestAssemb;
		this.listaComandosPrimitivosTrue = _listComPriTrue;
	}
	
	@Override
	public StringBuilder geraCodigoDestino() 
	{
		StringBuilder codigoDestino = new StringBuilder();
		codigoDestino.append( this.expDestinoAssembler );
		codigoDestino.append("dconst_0 \ndcmpg \n");
		codigoDestino.append("ifeq " + this.labelFalse + "\n" );
		
		LinkedList<ComandoPrimitivo> meusComandosPrimitvos = this.getListaComandosPrimitivosTrue().getListaComandosPrimitivos();
		for (ComandoPrimitivo comandoPrimitivo : meusComandosPrimitvos ) 
		{
			codigoDestino.append( comandoPrimitivo.geraCodigoDestino() );
		}
		
		return codigoDestino;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return "SeExpFalsoGoto(" + this.getLabel() + "," + this.getListaComandosPrimitivosTrue()+")\n";
	}
	
	public PrimitivoLabel getLabel()
	{
		return this.labelFalse;
	}
	
	public StringBuilder getExpDestinoAssembler()
	{
		return this.expDestinoAssembler;
	}
	
	public ListaComandosPrimitivos getListaComandosPrimitivosTrue()
	{
		return this.listaComandosPrimitivosTrue;
	}
	
}
