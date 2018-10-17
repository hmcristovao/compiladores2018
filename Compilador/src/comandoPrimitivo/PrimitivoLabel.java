package comandoPrimitivo;

public class PrimitivoLabel extends ComandoPrimitivo {
	String label;
	static int contador;
	
	public PrimitivoLabel(String label) {
		this.label = label;
	}
	public String geraCodigoDestino() { //terceira passagem gerar código intermediario
		return null;
	}

	public String toString() {
		return "label " +this.label+ " contador "+contador;
	}
}
