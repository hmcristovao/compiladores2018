package segundaPassagem;

public class PrimitivoLabel extends ComandoPrimitivo{
	
	private String label;
	private static int contador=0;
	
	public PrimitivoLabel(String _label) {
		this.label=_label + "_" + contador;
		contador++;
	}
	
	public String geraCodigoDestino() {
		return null;
	}

	public String toString() {
		return "Comando label: " + "-" + this.label;
	}

}
