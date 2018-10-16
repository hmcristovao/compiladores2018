package comandoPrimitivo;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo{
	
	String expDestinoAssembler;
	PrimitivoLabel labelFalse;
	ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String expDestinoAssembler, PrimitivoLabel labelFalse, ListaComandosPrimitivos listaComandosPrimitivosTrue){
		this.expDestinoAssembler = expDestinoAssembler;
		this.labelFalse = labelFalse;
		this.listaComandosPrimitivosTrue = listaComandosPrimitivosTrue;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return "Primitivo SeExpFalsoGoto" + this.expDestinoAssembler + this.labelFalse + this.listaComandosPrimitivosTrue + "\n";
	}
	
	

}