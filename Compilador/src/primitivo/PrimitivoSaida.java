package primitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	public String expDestinoAssembler;
	//public TipoDado tipo; 
	
	public PrimitivoSaida(String exp) {
		this.expDestinoAssembler = exp;
		//this.tipo = tipo;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return null;
	}
}
