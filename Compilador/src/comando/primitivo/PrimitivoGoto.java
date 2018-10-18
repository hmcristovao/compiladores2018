package comando.primitivo;

public class PrimitivoGoto extends ComandoPrimitivo{

	PrimitivoLabel label;
	
	public PrimitivoGoto(PrimitivoLabel _label) {
		this.label = _label;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	String geraCodigoDestino() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "goto "+this.label;
	}



}
