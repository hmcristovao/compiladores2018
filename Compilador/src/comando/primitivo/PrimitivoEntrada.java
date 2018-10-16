package comando.primitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{

	int referencia;
	TipoDado tipo;
	
	public PrimitivoEntrada(int _referencia, TipoDado _tipo) {
		this.referencia = _referencia;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null; //"Comando leitura\n" +"Variavel " + this.variavel.getLexema()
	}

}
