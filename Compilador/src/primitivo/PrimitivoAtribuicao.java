package primitivo;
import semantico.*;

public class PrimitivoAtribuicao extends ComandoPrimitivo{
	int referencia;
	TipoDado tipo;
	String expDestinoAssembler;
	
	public PrimitivoAtribuicao(int referencia, TipoDado tipo, String exp) {
		this.referencia = referencia;
		this.tipo = tipo;
		this.expDestinoAssembler = exp;		
	}
	
	public String geraCodigoDestino(){	
		return this.expDestinoAssembler + "dstore " + this.referencia + "\r\n";
	}
	
	public String toString() {
		return "" + this.referencia + "/" + this.tipo.toString() + "/" + this.expDestinoAssembler.toString();
	}
}
