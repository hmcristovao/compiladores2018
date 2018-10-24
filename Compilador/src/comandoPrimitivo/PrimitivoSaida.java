package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	String expDestinoAssembler;
	private TipoDado tipo;
	public PrimitivoSaida(String expDestinoAssembler,TipoDado tipo) {
		this.expDestinoAssembler = expDestinoAssembler;
		this.tipo=tipo;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return  this.tipo.toString();
	}

}
