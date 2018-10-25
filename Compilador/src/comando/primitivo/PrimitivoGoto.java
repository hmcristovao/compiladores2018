package comando.primitivo;

public class PrimitivoGoto extends ComandoPrimitivo{

	PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel _label) {
		this.label = _label;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	String geraCodigoDestino() {
		String codigoDestino = "goto " + this.label.getLabel().replace(":", "") + "\n";		
		return codigoDestino;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "goto "+this.label;
	}



}
