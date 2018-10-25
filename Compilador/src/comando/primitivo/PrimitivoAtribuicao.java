package comando.primitivo;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo {

	int referencia;
	TipoDado tipo;
	String expDestinoAssembler;
	
	public PrimitivoAtribuicao(int _referencia, TipoDado _tipo, String _expDestinoAssembler) {
		// TODO Auto-generated constructor stub
		this.referencia = _referencia;
		this.tipo = _tipo;
		this.expDestinoAssembler = _expDestinoAssembler;
	}
	
	@Override
	String geraCodigoDestino() {
		System.out.println(expDestinoAssembler);
		String codigoDestino = expDestinoAssembler;
		if(referencia >= 4) codigoDestino += "dstore_" + this.referencia + "\n";
		else {
			codigoDestino += "dstore_" + this.referencia + "\n";
		}
		return codigoDestino;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Referência: " + this.referencia + " / " + "Tipo de dado: " + this.tipo;
	}
}
