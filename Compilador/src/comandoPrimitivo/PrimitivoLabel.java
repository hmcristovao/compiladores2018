package comandoPrimitivo;

public class PrimitivoLabel extends ComandoPrimitivo{
	
	private String label;
	private static int contador = 0;
	
	public PrimitivoLabel(String label) {
		this.label = label + "_" +  PrimitivoLabel.contador;	
		PrimitivoLabel.contador++;	
	}
	public String getLabel() {
		return label + "\r\n";
	}

	public String geraCodigoDestino() {
		return this.label + ":" + "\r\n";
	}
	
	public String toString() {
		return "\nPrimitivo Label - nome label: " + this.label + "\r\n";
	}

}
