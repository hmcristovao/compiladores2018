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
		
		String codigoDestino = "new java/util/Scanner\n"
				+ "dup\n" 
				+ "getstatic java/lang/System.in Ljava/io/InputStream;\n"
				+ "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n";
				
		
		
		if(tipo == TipoDado.NUMERO) { 
			codigoDestino+="invokevirtual java/util/Scanner.nextDouble()D\n";
		}else { 
			codigoDestino+="invokevirtual java/util/Scanner.next()Ljava/lang/String;\n";	
		}
		
		
		if(referencia >= 4) {
			codigoDestino += "dstore " + this.referencia + "\n";
		}else {
			codigoDestino += "dstore_" + this.referencia + "\n";
		}		
		
		return codigoDestino;
	}
	
	public String toString() {
		return "Primitivo Entrada " + this.referencia + " " + this.tipo + "\n";
	}

}
