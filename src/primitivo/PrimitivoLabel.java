package primitivo;

public class PrimitivoLabel extends ComandoPrimitivo {
    private String label;
    private static int contador;

    public PrimitivoLabel(String label) {
        this.label = label;
        contador++;
    }
    
    @Override
    public String geraCodigoDestino() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
    	return "\n\n Primitiva Label: Label " +this.label+ " contador "+contador;
    }

}
