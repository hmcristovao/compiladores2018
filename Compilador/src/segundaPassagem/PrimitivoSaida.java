package segundaPassagem;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	
	private String expDestinoAssembler;
	TipoDado tipo;
	
	public PrimitivoSaida(TipoDado _tipo, String _expDestinoAssembler) {
		this.tipo=_tipo;
		this.expDestinoAssembler=_expDestinoAssembler;		
	}
	
	public String geraCodigoDestino() {
		return null;
	}

	public String toString() {
		return "Comando Saida : " + "-" + this.tipo + "-" + this.expDestinoAssembler;
	}

}
