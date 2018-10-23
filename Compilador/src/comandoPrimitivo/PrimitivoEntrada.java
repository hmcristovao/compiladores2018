package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo {
	
	int referencia;
	TipoDado tipo;
	
	
	public PrimitivoEntrada(int referencia, TipoDado tipo) {
		this.referencia = referencia;
		this.tipo = tipo;
		
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return "Primitivo Entrada " + this.referencia + " " + this.tipo + "\n";
	}

}
