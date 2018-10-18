package comando.primitivo;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo {

	int referencia;
	TipoDado tipo;
	String expDestinoAssembler;
	
	public PrimitivoAtribuicao(int _referencia, TipoDado _tipo, String _expDestinoAssembler) {
		this.referencia = _referencia;
		this.tipo = _tipo;
		this.expDestinoAssembler = _expDestinoAssembler;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Referência: " + this.referencia + " / " + "Tipo de dado: " + this.tipo;
	}

	//public abstract ListaComandosAltoNivel geraListaComandosAltoNivel();
}
