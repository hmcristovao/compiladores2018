package comandoPrimitivo;

public class PrimitivoLabel extends ComandoPrimitivo{
	
	String label;
	static int contador;
	
	public PrimitivoLabel(String label) {
		this.label = label;		
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return "Primitivo Label " + this.label + " " +  this.contador + "\n";
	}

}
