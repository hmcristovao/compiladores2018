package segundaPassagem;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo{
	
	private String expDestinoAssembler;
	PrimitivoLabel labelFalse;
	ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String _expDestinoAssembler, PrimitivoLabel _labelFalse, ListaComandosPrimitivos _listaComandosPrimitivosTrue) {
		this.expDestinoAssembler=_expDestinoAssembler;
		this.labelFalse=_labelFalse;
		this.listaComandosPrimitivosTrue=_listaComandosPrimitivosTrue;
	}
	
	public String geraCodigoDestino() {
		return null;
	}

	public String toString() {
		return "Comando SeExpFalsoGoto: "+"-"+this.labelFalse +"-"+ this.expDestinoAssembler +"-"+ this.listaComandosPrimitivosTrue;
	}

}
