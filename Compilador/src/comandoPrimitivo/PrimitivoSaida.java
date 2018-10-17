package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo {
	TipoDado tipo;
	String expDestinoAssembler;
	
	public PrimitivoSaida(TipoDado tipo, String expDestinoAssembler){
		this.tipo = tipo;
		this.expDestinoAssembler = expDestinoAssembler;
	}
	
	public String geraCodigoDestino() { //terceira passagem gerar código intermediario
		return null;
	}

	public String toString() {
		return "tipo "+this.tipo+" expDestinoAssembler "+this.expDestinoAssembler+"\n";
	}
}
