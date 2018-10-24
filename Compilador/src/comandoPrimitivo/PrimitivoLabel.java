package comandoPrimitivo;

public class PrimitivoLabel extends ComandoPrimitivo {
	String label;
	static int contador;
	
	public PrimitivoLabel(String label){
		this.label= label;
	}
	
	public String geraCodigodestino() {
		return null;
	}
	
	public String toString() {
		return this.label;
	}
}
