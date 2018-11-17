package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	
	private TipoDado tipo;
	private String expDestinoAssembler;
		
	public PrimitivoSaida(TipoDado tipo, String expDestinoAssembler) {
		this.tipo = tipo;
		this.expDestinoAssembler = expDestinoAssembler;
	}
	
	public String geraCodigoDestino() {
		
		String codigoDestino = "getstatic java/lang/System/out Ljava/io/PrintStream; \r\n"
				+ this.expDestinoAssembler;
		
		if(this.tipo == TipoDado.NUMERO) { 
			codigoDestino+="invokevirtual java/io/PrintStream/print(D)V \r\n";
		}else { 
			codigoDestino+= "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V \r\n";	
		}
		return codigoDestino;
	}
	
	public String toString() {
		return "\nPrimitivo Saida - tipo: " + this.tipo 
			 + "; expressao assembler:\n" + this.expDestinoAssembler;
	}

}
