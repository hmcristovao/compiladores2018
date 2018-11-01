package comandoPrimitivo;

public class PrimitivoLabel extends ComandoPrimitivo{
	
	private String label;
	private static int contador = 0;
	
	public PrimitivoLabel(String label) {
		this.label = label + "_" +  this.contador;	
		this.contador++;
		
	}
	
	public String getLabel() {
		return label;
	}

	public String geraCodigoDestino() {
		String codigoDestino = this.label + ":" + "\n";
		return codigoDestino;
	}
	
	public String toString() {
		return "Primitivo Label " + this.label + " " +  this.contador + "\n";
	}

}
