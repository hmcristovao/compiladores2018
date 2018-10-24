package comandoPrimitivo;

public class PrimitivoSeExpFalsoGoto {
	String expDestinoAssembler;
	private PrimitivoLabel labelFalse;
	private ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String expDestinoAssembler, PrimitivoLabel labelFalse, ListaComandosPrimitivos listaComandosPrimitivosTrue){
		this.expDestinoAssembler = expDestinoAssembler;
		this.labelFalse = labelFalse;
		this.listaComandosPrimitivosTrue = listaComandosPrimitivosTrue;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return this.expDestinoAssembler + this.labelFalse.toString()+this.listaComandosPrimitivosTrue.toString();
	}
	
	

}
