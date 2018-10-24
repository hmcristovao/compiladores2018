package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{
	int referencia;
	private TipoDado tipo;
	
	public PrimitivoEntrada(int referencia, TipoDado tipo) {
		this.tipo=tipo;
		this.referencia = referencia;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return this.tipo.toString();
	}
}