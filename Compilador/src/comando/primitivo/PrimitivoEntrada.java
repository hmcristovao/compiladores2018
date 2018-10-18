package comando.primitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{

	int referencia;
	TipoDado tipo;
	
	public PrimitivoEntrada(int _referencia, TipoDado _tipo) {
		this.referencia = _referencia;
		this.tipo = _tipo;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	String geraCodigoDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Referência: " + this.referencia + " / " + "Tipo de dado: " + this.tipo;
	}


}
