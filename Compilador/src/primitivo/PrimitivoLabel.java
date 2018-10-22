package primitivo;

public class PrimitivoLabel extends ComandoPrimitivo{
	public String label;
	static int contador = 0;//diferenciar de outros labels
	
	public PrimitivoLabel(String label) {
		this.label = label;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return null;
	}
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		PrimitivoLabel.contador = contador;
	}
}
