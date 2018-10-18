package primitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{
	public int referencia;
	public TipoDado tipo;
	
	public PrimitivoEntrada(int ref, TipoDado tipo) {
		this.referencia = ref;
		this.tipo = tipo;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return null;
	}
	
	
}
