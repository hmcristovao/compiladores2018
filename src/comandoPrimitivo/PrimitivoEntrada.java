package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo {

    private int referencia;
    private TipoDado tipo;

    public PrimitivoEntrada(int referencia, TipoDado tipo) {
        this.referencia = referencia;
        this.tipo = tipo;
    }
    
    public String geraCodigoDestino() {
    	String codigoDestinoEntrada = "";
    	codigoDestinoEntrada += "new java/util/Scanner\n";
    	codigoDestinoEntrada += "dup\n";
    	codigoDestinoEntrada += "getstatic java/lang/System.in Ljava/io/InputStream;\n";
    	codigoDestinoEntrada += "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n";
    	
    	if (tipo == TipoDado.NUM) {
    		codigoDestinoEntrada += "invokevirtual java/util/Scanner.nextDouble()D\n";
    		codigoDestinoEntrada += "dstore " + this.referencia + " \r\n";
    	}
    	else {
    		codigoDestinoEntrada += "invokevirtual java/util/Scanner.next()Ljava/lang/String;\n";
    		codigoDestinoEntrada += "astore " + this.referencia + " \r\n";
    	}
    	
        return codigoDestinoEntrada;
    }

    public String toString() {
    	return "\n\nPrimitiva Entrada:" + "\nReferência: " + this.referencia  + "\nTipo de dado: " + this.tipo;
    }

}