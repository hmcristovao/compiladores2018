package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	
	TipoDado tipo;
	String expDestinoAssembler;
	
	
	public PrimitivoSaida(TipoDado tipo, String expDestinoAssembler) {
		this.tipo = tipo;
		this.expDestinoAssembler = expDestinoAssembler;
		
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return "Primitivo Saida " + this.tipo + this.expDestinoAssembler +"\n";
	}

}
