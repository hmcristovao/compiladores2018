package primitivo;

public class PrimitivoGoto extends ComandoPrimitivo{
	PrimitivoLabel label; //para onde o desvio será feito
	
	public PrimitivoGoto(PrimitivoLabel label) {
		this.label = label;
	}
	
	String geraCodigoDestino() {		
		return "goto " + this.label.geraCodigoDestino().replace(":", "");
	}
	
	public String toString() {
		return "" + this.label;
	}
}
