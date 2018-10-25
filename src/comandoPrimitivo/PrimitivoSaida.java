package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo {
	private String expDestinoAssembler;
    private TipoDado tipo;
    

    public PrimitivoSaida(String expDestinoAssembler, TipoDado tipo) {
        this.tipo = tipo;
        this.expDestinoAssembler = expDestinoAssembler;
    }

    public String geraCodigoDestino() {
    	String codigoDestinoSaida = "";
    	codigoDestinoSaida += "getstatic java/lang/System/out Ljava/io/PrintStream; \r\n";
    	codigoDestinoSaida += this.expDestinoAssembler;
    	
    	if (tipo == TipoDado.NUM) {
    		codigoDestinoSaida += "invokevirtual java/io/PrintStream/println(D)V\r\n";
    	}
    	else {
    		codigoDestinoSaida += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\r\n";
    	}
    	
    	return codigoDestinoSaida;
    }

   public String toString() {
    	return "\n\nPrimitiva Saida: \nTipo: "+this.tipo+" \nExpDestinoAssembler: "+this.expDestinoAssembler+"\n";
    }

}