package comandoPrimitivo;

public class PrimitivoGoto extends ComandoPrimitivo {

    private PrimitivoLabel label;

    public PrimitivoGoto(PrimitivoLabel label) {
        this.label = label;
    }

    public String geraCodigoDestino() {
    	String codigoDestinoGoto = "";
    	codigoDestinoGoto += "goto " + this.label.getLabel() + "\r\n";
    	
        return codigoDestinoGoto;
    }

    public String toString() {
    	return "\n\n Primitivo Goto: \nLabel: "+this.label.toString();
    }

}