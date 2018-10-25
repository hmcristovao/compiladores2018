package primitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{
	public int referencia;
	public TipoDado tipo;
	
	public PrimitivoEntrada(int ref, TipoDado tipo) {
		this.referencia = ref;
		this.tipo = tipo;
	}
	
	public String geraCodigoDestino() {		
		String saida = ";begin Leitura \r\n";
		saida += "new java/util/Scanner \r\n"
						+ "dup \r\n"
						+ "getstatic java/lang/System/in Ljava/io/InputStream; \r\n"
						+ "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V \r\n";
		
		if (this.tipo == TipoDado.NUM)
		{
			saida += "invokevirtual java/util/Scanner/NextDouble()D\r\n" + "dstore " + this.referencia+ "\r\n";
		}
		else if(this.tipo == TipoDado.STR) {
			saida += "invokevirtual java/util/Scanner/NextLine()Ljava/lang/String;\r\n" + "astore " + this.referencia + "\r\n";
		}
		saida += ";end Leitura \r\n";
		
		return saida;
	}
	
	public String toString() {
		return this.referencia + "/" + this.tipo;
	}
		
}
