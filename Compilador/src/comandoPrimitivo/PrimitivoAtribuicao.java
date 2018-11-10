package comandoPrimitivo;

import semantico.TipoDado;
import codigoDestino.CodigoDestino;

public class PrimitivoAtribuicao extends ComandoPrimitivo {

	private int referencia;
	private TipoDado tipo;
	private String expDestinoAssembler;


	public PrimitivoAtribuicao(int referencia, TipoDado tipo, String expDestinoAssembler) {
		this.referencia = referencia;
		this.tipo = tipo;
		this.expDestinoAssembler = expDestinoAssembler;	
	}

	public String geraCodigoDestino() {
		String codigoDestino = this.expDestinoAssembler;
		if(this.tipo == TipoDado.NUMERO) {
			if(referencia >= 4) 
				codigoDestino += "dstore " + this.referencia + "\r\n";
			else 
				codigoDestino += "dstore_" + this.referencia + "\r\n";
		}
		else if(this.tipo == TipoDado.PALAVRA) {
			if(referencia >= 4) 
				codigoDestino += "astore " + this.referencia + "\r\n";
			else 
				codigoDestino += "astore_" + this.referencia + "\r\n";
		}
		return codigoDestino;
	}

	public String toString() {
		return "\nPrimitivo Atribuicao - referencia: " + this.referencia 
			 + "; tipo: " + this.tipo + "; expressao assembler:\n" 
			 + this.expDestinoAssembler;
	}	

}
