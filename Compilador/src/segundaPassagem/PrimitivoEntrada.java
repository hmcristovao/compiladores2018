package segundaPassagem;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{
	
	private int referencia;
	TipoDado tipo;
	
	public PrimitivoEntrada(int _referencia, TipoDado _tipo) {
		this.referencia=_referencia;
		this.tipo=_tipo;
	}
	
	public String geraCodigoDestino() {
		String saida="new java/util/Scanner\n"
				+ "dup\n" 
				+ "getstatic java/lang/System.in Ljava/io/InputStream;\n"
				+ "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n";
		if(tipo == TipoDado.NUMERO)
			saida+="invokevirtual java/util/Scanner/nextDouble()D\r\ndstore "+ this.referencia + "\r\n";
		else if (tipo == TipoDado.NUMERO)
			saida+="invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;\r\nastore "+ this.referencia + "\r\n";
		
		return saida;
	}

	public String toString() {
		return "Comando Entrada : " + "-" + this.tipo + "-" + this.referencia;
	}
	

}
