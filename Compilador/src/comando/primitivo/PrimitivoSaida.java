package comando.primitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{

	String expDestinoAssembler;
	TipoDado tipo;
	
	public PrimitivoSaida(int _referencia, TipoDado _tipo) {
		//this.referencia = _referencia;
		this.tipo = _tipo;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null; //"Comando leitura\n" +"Variavel " + this.variavel.getLexema()
	}

}
