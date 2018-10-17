package comandoPrimitivo;

public class PrimitivoGoto extends ComandoPrimitivo {
	PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel label) {
		this.label = label;
	}

	public String geraCodigoDestino() {
		
		return null;
	}
	
	public String toString() {
		return "label"+this.label;
	}
	
}
