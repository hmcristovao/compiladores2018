package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{
	int referencia;
	TipoDado tipo;
	
	public PrimitivoEntrada(int referencia, TipoDado tipo){
		this.referencia = referencia;
		this.tipo = tipo;
	}
	
	public String geraCodigoDestino() { //terceira passagem gerar código intermediario
		return null;
	}

	public String toString() {
		return " ref "+this.referencia+" tipo "+this.tipo;
	}

}
