package primitivo;
import semantico.*;

public class PrimitivoAtribuicao extends ComandoPrimitivo{
	int referencia;
	TipoDado tipo;
	String expDestinoAssembler; //assembly
	
	public PrimitivoAtribuicao(int referencia, TipoDado tipo, String exp) {
		this.referencia = referencia;
		this.tipo = tipo;
		this.expDestinoAssembler = exp;		
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString() {
		return null;
	}
}
