package primitivo;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo{
	public String expDestinoAssembler;
	public PrimitivoLabel labelfalse;
	ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String exp, PrimitivoLabel label, ListaComandosPrimitivos lista) {
		this.expDestinoAssembler = exp;
		this.labelfalse = label;
		this.listaComandosPrimitivosTrue = lista;
	}
	
	String geraCodigoDestino() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
