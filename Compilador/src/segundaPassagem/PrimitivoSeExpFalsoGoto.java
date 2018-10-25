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
		String saida = this.expDestinoAssembler;
		saida+="dconst_0\r\n";
		saida+="dcmpg\r\n";
		saida+="ifeq " + this.labelFalse.getLabel() + "\r\n";
		saida+=this.listaComandosPrimitivosTrue.geraCodigoDestinoTotal();
		return saida;
	}

	public String toString() {
		return "Comando SeExpFalsoGoto: "+"-"+this.labelFalse +"-"+ this.expDestinoAssembler +"-"+ this.listaComandosPrimitivosTrue;
	}

}
