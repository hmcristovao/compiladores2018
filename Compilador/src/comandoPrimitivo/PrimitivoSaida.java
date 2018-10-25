package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	
	TipoDado tipo;
	String expDestinoAssembler;
	
	
	public PrimitivoSaida(TipoDado tipo, String expDestinoAssembler) {
		this.tipo = tipo;
		this.expDestinoAssembler = expDestinoAssembler;
		
	}
	
	public String geraCodigoDestino() {
		
		String codigoDestino = "getstatic java/lang/System/out Ljava/io/PrintStream;\n"
				+ this.expDestinoAssembler
				+ "invokevirtual java/io/PrintStream/println(D)V\n";
		
		return codigoDestino;
		
	}
	
	public String toString() {
		return "Primitivo Saida " + this.tipo + " " + this.expDestinoAssembler +"\n";
	}

}
