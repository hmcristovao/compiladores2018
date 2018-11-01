package comandoPrimitivo;

public class PrimitivoGoto extends ComandoPrimitivo{
	
	private PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel label){
		this.label = label;
	}
	
	public String geraCodigoDestino() {
		
		String codigoDestino = "goto " + this.label.getLabel() + "\n";		
		return codigoDestino;
	}
	
	public String toString() {
		return "Primitivo Goto " + this.label + "\n";
	}

}
