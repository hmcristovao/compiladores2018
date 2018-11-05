package comandoPrimitivo;

public class PrimitivoSeExpFalsoGoto extends ComandoPrimitivo{
	
	private String expDestinoAssembler;
	private PrimitivoLabel labelFalse;
	private ListaComandosPrimitivos listaComandosPrimitivosTrue;
	
	public PrimitivoSeExpFalsoGoto(String expDestinoAssembler, PrimitivoLabel labelFalse, ListaComandosPrimitivos listaComandosPrimitivosTrue){
		this.expDestinoAssembler = expDestinoAssembler;
		this.labelFalse = labelFalse;
		this.listaComandosPrimitivosTrue = listaComandosPrimitivosTrue;
	}
	
	public String geraCodigoDestino() {
		String codigoDestino = 
			      this.expDestinoAssembler
				+ "dconst_0 \r\n"
				+ "dcmpg \r\n"
				+ "ifeq "+this.labelFalse.getLabel() + "\r\n"
				+ this.listaComandosPrimitivosTrue.geraCodigoDestinoTotal();
		
		return codigoDestino;
	}
	
	public String toString() {
		return "\nPrimitivo SeExpFalsoGoto - expressao assembler:\n" 
	         + this.expDestinoAssembler + "; label do goto: " 
			 + this.labelFalse + "; lista comandos true:\n" 
	         + this.listaComandosPrimitivosTrue;
	}
}
