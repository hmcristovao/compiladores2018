package segundaPassagem;

public class PrimitivoGoto extends ComandoPrimitivo{
	
	PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel _label) {
		this.label=_label;
	}
	
	public String geraCodigoDestino() {
		return null;
	}

	public String toString() {
		return "Comando Goto : " + "-" + this.label;
	}

}
