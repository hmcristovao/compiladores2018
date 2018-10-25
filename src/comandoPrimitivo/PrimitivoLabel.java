package comandoPrimitivo;

public class PrimitivoLabel extends ComandoPrimitivo {
    private String label;
    private static int contador;

    public PrimitivoLabel(String label) {
        this.label = label +"-" + contador;
        contador++;
    }
    
    public String geraCodigoDestino() {
    	String codigoDestinoLabel = "";
    	codigoDestinoLabel += this.label + ": \r\n";
    	
        return codigoDestinoLabel;
    }

    public String toString() {
    	return "\n\n Primitiva Label: \nLabel: " +this.label+ "\nContador: "+contador;
    }

	public String getLabel() {
		return label;
	}
	
	public int getContador() {
		return contador;
	}


}