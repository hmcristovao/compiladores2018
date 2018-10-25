package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo {
	
	int referencia;
	TipoDado tipo;
	String expDestinoAssembler;
	
	
	public PrimitivoAtribuicao(int referencia, TipoDado tipo, String expDestinoAssembler) {
		this.referencia = referencia;
		this.tipo = tipo;
		this.expDestinoAssembler = expDestinoAssembler;
		
	}
	
	public String geraCodigoDestino() {
		
		String codigoDestino = expDestinoAssembler;
		
		if(referencia >= 4) {
			codigoDestino += "dstore " + this.referencia + "\n";
		}else {
			codigoDestino += "dstore_" + this.referencia + "\n";
		}
		
		return codigoDestino;
	}
	
	public String toString() {
		return "Primitivo Atribuicao " + this.referencia + " " + this.tipo + " " + this.expDestinoAssembler +"\n";
	}	

}
