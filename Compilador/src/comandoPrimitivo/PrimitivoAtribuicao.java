package comandoPrimitivo;

import java.util.LinkedList;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo {
	int referencia;
	private TipoDado tipo;
	String expDestinoAssembler;
	
	public PrimitivoAtribuicao(int referencia,TipoDado tipo, String dado){
		this.referencia= referencia;
		this.tipo = tipo;
		this.expDestinoAssembler = dado;
	}
	
	public String geraCodigoDestino() {
		return null;
	}
	
	public String toString(){
		return this.tipo.toString() +  this.expDestinoAssembler;	
		}

}
