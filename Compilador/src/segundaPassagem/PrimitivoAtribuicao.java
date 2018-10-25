package segundaPassagem;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo{
	
	TipoDado tipo;
	private int referencia;
	private String expDestinoAssembler;
	
	public PrimitivoAtribuicao(int _referencia, TipoDado _tipo, String _expDestinoAssembler){
		this.tipo=_tipo;
		this.referencia=_referencia;
		this.expDestinoAssembler=_expDestinoAssembler;
	}
	
	public String geraCodigoDestino() {
		String saida=this.expDestinoAssembler;
		saida += "dstore " + this.referencia + "\r\n";
		return saida;
	}
	
	public String toString() {
		return "Comando Atribuicao: " + "-" + this.expDestinoAssembler + "-" + this.referencia + "-" + this.tipo;
	}

}
