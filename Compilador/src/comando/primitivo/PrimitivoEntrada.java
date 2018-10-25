package comando.primitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{

	int referencia;
	TipoDado tipo;
	
	public PrimitivoEntrada(int _referencia, TipoDado _tipo) {
		this.referencia = _referencia;
		this.tipo = _tipo;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	String geraCodigoDestino() {
		String codigoDestino = "new java/util/Scanner\n"
								+ "dup\n" 
								+ "getstatic java/lang/System.in Ljava/io/InputStream;\n"
								+ "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\n";
		if(tipo == TipoDado.NUM) codigoDestino += "invokevirtual java/util/Scanner.nextDouble()D\n";
		else { 
			codigoDestino+="invokevirtual java/util/Scanner.next()Ljava/lang/String;\n";	
		}
		if(referencia >= 4) codigoDestino += "dstore_" + this.referencia + "\n";
		else {
			codigoDestino += "dstore_" + this.referencia + "\n";
		}		
		
		return codigoDestino;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Referência: " + this.referencia + " / " + "Tipo de dado: " + this.tipo;
	}


}
