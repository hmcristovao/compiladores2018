package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo {
	TipoDado tipo;
	String expDestinoAssembler;
	
	public PrimitivoSaida(TipoDado tipo, String expDestinoAssembler){
		this.tipo = tipo;
		this.expDestinoAssembler = expDestinoAssembler;
	}
	
	public String geraCodigoDestino() { //terceira passagem gerar código intermediario
		String codDestinoSaida = "";
		codDestinoSaida += "getstatic java/lang/System/out Ljava/io/PrintStream;\r\n"
				+ this.expDestinoAssembler
				+ "invokevirtual java/io/PrintStream/println(D)V\r\n";
		return codDestinoSaida;
	}

	public String toString() {
		return "Saida: tipo "+this.tipo+" expDestinoAssembler "+this.expDestinoAssembler+"\n";
	}
}
