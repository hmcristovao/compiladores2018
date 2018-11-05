package comandoPrimitivo;

public class PrimitivoGoto extends ComandoPrimitivo{
	
	private PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel label){
		this.label = label;
	}
	
	public String geraCodigoDestino() {
		
		String codigoDestino = "goto " + this.label.getLabel() + "\r\n";		
		return codigoDestino;
	}
	
	public String toString() {
		return "\nPrimitivo Goto - nome do label: " + this.label;
	}

}
