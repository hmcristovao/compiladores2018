package comandoPrimitivo;

public class PrimitivoGoto {
	private PrimitivoLabel label;
	public PrimitivoGoto(PrimitivoLabel label) {
		this.label=label;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString(){
		return this.label.toString();
	}
	
}
