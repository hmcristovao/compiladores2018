package comandoPrimitivo;

public class PrimitivoGoto extends ComandoPrimitivo {
	PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel label) {
		this.label = label;
	}

	public String geraCodigoDestino() {
		//salta para a label sem os dois pontos
		return "goto "+this.label.geraCodigoDestino().substring(1)+"\r\n";
	}
	
	public String toString() {
		return "label"+this.label;
	}
	
}
