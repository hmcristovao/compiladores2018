package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoEntrada extends ComandoPrimitivo{
	int referencia;
	TipoDado tipo;
	
	public PrimitivoEntrada(int referencia, TipoDado tipo){
		this.referencia = referencia;
		this.tipo = tipo;
	}
	
	public String geraCodigoDestino() { //terceira passagem gerar código intermediario
		//sempre lê para alguma variavel ja declarada
		//a entrada vem da pilha? DUVIDA
		String codDestinoEntrada = "";
		
		codDestinoEntrada+=";begin entrada\r\n";
		codDestinoEntrada+="new java/util/Scanner\r\n"
				+ "dup\r\n"
				+ "getstatic java/lang/System/in Ljava/io/InputStream;\r\n"
				+ "invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V\r\n"; 
		if(tipo == TipoDado.NUM) { 
			codDestinoEntrada+="invokevirtual java/util/Scanner/nextDouble()D\r\n";
			codDestinoEntrada+= "dstore " + this.referencia + " \r\n";
		}else { //caso não seja um número será uma STR
			codDestinoEntrada+="invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;\r\n";
			codDestinoEntrada+= "astore " + this.referencia + " \r\n";
		}
		codDestinoEntrada+= ";end entrada \n";
		return codDestinoEntrada;
	}

	public String toString() {
		return "Entrada: ref "+this.referencia+" tipo "+this.tipo+"\n";
	}

}
