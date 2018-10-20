package segundaPassagem;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{
	
	private int referencia;
	TipoDado tipo;
	
	public PrimitivoEntrada(int _referencia, TipoDado _tipo) {
		this.referencia=_referencia;
		this.tipo=_tipo;
	}
	
	public String geraCodigoDestino() {
		return null;
	}

	public String toString() {
		return "Comando Entrada : " + "-" + this.tipo + "-" + this.referencia;
	}
	

}
