package segundaPassagem;

public class PrimitivoGoto extends ComandoPrimitivo{
	
	PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel _label) {
		this.label=_label;
	}
	
	public String geraCodigoDestino() {
		return "goto "+ this.label.getLabel() + "\r\n";
	}

	public String toString() {
		return "Comando Goto : " + "-" + this.label;
	}

}
