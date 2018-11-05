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
		
		String codigoDestino = 
				  "new java/util/Scanner \r\n"
				+ "dup \r\n" 
				+ "getstatic java/lang/System.in Ljava/io/InputStream; \r\n"
				+ "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V \r\n";
					
		if(this.tipo == TipoDado.NUMERO) { 
			codigoDestino+="invokevirtual java/util/Scanner.nextDouble()D \r\n";
			if(referencia >= 4) 
				codigoDestino += "dstore " + this.referencia + "\r\n";
			else 
				codigoDestino += "dstore_" + this.referencia + "\r\n";
			
		} else if(this.tipo == TipoDado.PALAVRA) { 
			codigoDestino+="invokevirtual java/util/Scanner.nextLine()Ljava/lang/String; \r\n";
			if(referencia >= 4) 
				codigoDestino += "astore " + this.referencia + "\r\n";
			else 
				codigoDestino += "astore_" + this.referencia + "\r\n";
		}
				
		return codigoDestino;
	}
	
	public String toString() {
		return "\nPrimitivo Entrada - referencia: " + this.referencia 
			 + ", tipo: " + this.tipo;
	}

}
