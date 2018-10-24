package primitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	public String expDestinoAssembler;
	public TipoDado tipo; 
	
	public PrimitivoSaida(String exp, TipoDado tipo) {
		this.expDestinoAssembler = exp;
		this.tipo = tipo;
	}
	
	public String geraCodigoDestino() {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;\r\n" + 
				"dload" + this.referencia + "\r\n" +
				"invokevirtual java/io/PrintStream/println(D)V\r\n";
	}
	
	public String toString() {
		return this.expDestinoAssembler + "," + this.tipo;
	}
}
