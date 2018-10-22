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
		
		codDestinoEntrada+=";begin entrada\n"
				+ "dstore " + this.referencia + " \r\n"
				+ ";end entrada \n";
		return codDestinoEntrada;
	}

	public String toString() {
		return "Entrada: ref "+this.referencia+" tipo "+this.tipo+"\n";
	}

}
