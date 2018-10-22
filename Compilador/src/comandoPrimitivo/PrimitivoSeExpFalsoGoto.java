package comandoPrimitivo;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo{
	String expDestinoAssembler;
	PrimitivoLabel labelFalse;
	ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String expDestinoAssembler , PrimitivoLabel labelFalse, ListaComandosPrimitivos listaComandosPrimitivosTrue) {
		this.expDestinoAssembler = expDestinoAssembler;
		this.labelFalse = labelFalse;
		this.listaComandosPrimitivosTrue = listaComandosPrimitivosTrue;
	}
	
	public String geraCodigoDestino() { //terceira passagem
		return this.expDestinoAssembler;
	}

	
	public String toString() {
		return "SeExpFalsoGoto: expDestinoAssembler " +this.expDestinoAssembler+ " labelFalse "+this.labelFalse+" listaComandosPrimitivosTrue "+this.listaComandosPrimitivosTrue+"\n" ;
	}

}

